package com.utad.designpatterns.contoladores;
import com.utad.designpatterns.enemigos.*;
import com.utad.designpatterns.enemigos.estados.Estado;
import com.utad.designpatterns.enemigos.estados.EstadoActivo;
import com.utad.designpatterns.enemigos.estados.EstadoHerido;
import com.utad.designpatterns.enemigos.estados.EstadoParalizado;
import com.utad.designpatterns.mundos.*;
import com.utad.designpatterns.jugador.*;

import java.util.Scanner;
/**
 * Clase GameController que gestiona todo lo relaccionado con el juego
 * @author rodri
 *
 */
public class GameController {
	
	
	private Jugador jugador = new Jugador(); //protagonista
	private Calculadora calculadora = Calculadora.getInstance(); //contiene la logica de golpe y de estrategias
	private Pokemon enemigo; //enemigo al que se enfrenta el protagonista
	private ContextoCrear crear = ContextoCrear.getInstance(); //	Contexto que controla las factorias
	private int contadorPokemon = 0; //lleva la cuenta de los pokemons a los que sea enfreado en el nivel
	private Scanner sc = new Scanner(System.in); // scanner para introducir datos
	
	/**
	 * Patrón Singleton
	 */
	private static GameController gameController;
	private GameController(){} //privado
	
	public static GameController getInstance(){
		
		if (gameController==null){
			gameController = new GameController();
		}
		return gameController;
		
	}
	
	
	public Pokemon getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Pokemon enemigo) {
		this.enemigo = enemigo;
	}
	
	
	/**
	 * Clase que crea el personaje y le asigna un pokemon a eleccion
	 */
	public void create_personaje() {
		String entradaTeclado;
        entradaTeclado = this.sc.nextLine (); 
        jugador.setName(entradaTeclado);
		
		System.out.println("Bienvenido " + jugador.getName());
		System.out.println("¿Qué pokemon quieres como tu inicial?: ");
		System.out.println("1_ Beldum\n2_ Gastly\n3_ Pichu\n4_ Piplup\n5_ Ralts\n");
		entradaTeclado = sc.nextLine();
		switch(entradaTeclado) {
			case "1": jugador.setPokemon((Pokemon)crear.createBeldum()); 
			 break;
			case "2": jugador.setPokemon((Pokemon)crear.createGastly()); 
			 break;
			case "3": jugador.setPokemon((Pokemon)crear.createPichu()); 
			 break;
			case "4": jugador.setPokemon((Pokemon)crear.createPiplup()); 
			 break;
			case "5": jugador.setPokemon((Pokemon)crear.createRalts()); 
			 break;
		}
		
		System.out.println("Ha elegido a: " + jugador.getPokemon().getNombre());	
	}
	
	/**
	 * Cambia el nivel cambiando la factoria de los pokemons para crear los que pertenecen a ese nivel según el nombre de los actuales
	 */
	public void changeWorld() {
		
		if(jugador.getPokemon().getNivel() == Nivel.Nivel1) {
			crear.setTipoPokemonAbstractFactory(new Nivel2AbstractFactory());
			
			switch(jugador.getPokemon().getNombre()) {
			case "Beldum": jugador.setPokemon((Pokemon)crear.createBeldum()); 
			 break;
			case "Gastly": jugador.setPokemon((Pokemon)crear.createGastly()); 
			 break;
			case "Pichu": jugador.setPokemon((Pokemon)crear.createPichu());
			 break;
			case "Piplup": jugador.setPokemon((Pokemon)crear.createPiplup()); 
			 break;
			case "Ralts": jugador.setPokemon((Pokemon)crear.createRalts()); 
			 break;
			}

		}else if(jugador.getPokemon().getNivel() == Nivel.Nivel2) {
			crear.setTipoPokemonAbstractFactory(new Nivel3AbstractFactory());
			
			switch(jugador.getPokemon().getNombre()) {
			case "Metang": jugador.setPokemon((Pokemon)crear.createBeldum()); 
			 break;
			case "Hunter": jugador.setPokemon((Pokemon)crear.createGastly()); 
			 break;
			case "Pikachu": jugador.setPokemon((Pokemon)crear.createPichu());
			 break;
			case "Prinplup": jugador.setPokemon((Pokemon)crear.createPiplup()); 
			 break;
			case "Kirlia": jugador.setPokemon((Pokemon)crear.createRalts()); 
			 break;
			}
		}
		
		
		
		System.out.println("Tu pokemon esta evolucionando...!!\nHa evolucionado a: " + jugador.getPokemon().getNombre());
	}
	
	/**
	 * Elige el enemigo al que se va enfrentar el personaje excluyendo al pokemon que tiene el personaje
	 */
	public void seleccionarEnemigo() {
		do {
			createPokemon(contadorPokemon);
			this.enemigo.getNombre();
			contadorPokemon++;
		}while(this.enemigo.getNombre() == jugador.getPokemon().getNombre());
	}
	
	/**
	 * Avanza por el nivel cambiando los combates una vez que se van superando 
	 * @return
	 */
	public boolean avanceNivel() {
		boolean resultado = false;
		contadorPokemon = 0;
		while(contadorPokemon < 5) {
			resultado = combat();
			if(resultado == false) {
				break;
			}
		}
		
		return resultado;
	}
	
	/**
	 * Contiene toda la logica que seguira el combate y se apoya en la calculadora para obtener el daño que hace	 cada golpe
	 * @return
	 */
	public boolean combat() {
		float vida = jugador.getPokemon().getVidas();
		boolean resultado = false;
		
			seleccionarEnemigo();
				
			calculadora.strategy(enemigo);
			
			
			System.out.println(jugador.getName() + " saca a: " + jugador.getPokemon().getNombre() + " se enfrenta a: " + enemigo.getNombre());
			
			float danioPersonaje = 0;
			float danioEnemigo = 0;
			float golpe = 0;
	        
			while(jugador.getPokemon().getVidas() > 0 && enemigo.getVidas() > 0) { //Bucle de combate
				String seleccion;
				System.out.println("Vida enemigo: " + enemigo.getVidas());
				System.out.println("Vida personaje: " + jugador.getPokemon().getVidas());
				System.out.println("");
				
				System.out.println("¿Qué quieres que haga tu pokemon?");
				System.out.println("1_Ataque débil\n2_Ataque fuerte\n3_Defensa\n");
				
				seleccion = this.sc.nextLine();
		        switch(seleccion) { //Eleccion de ataque
		        	case "1": danioPersonaje = jugador.ataqueBase();
		        		break;
		        	case "2": danioPersonaje = jugador.ataqueFuerte();
		        		break;
		        	case "3": danioPersonaje = jugador.defensaBase(); 
		        		break;
		        }// Enmigo eleccion de ataque
		        if(enemigo.siguienteMovimiento().equals(Movimiento.ATACAR)) {
		        	danioEnemigo = enemigo.ataque();
		        }else {
		        	danioEnemigo = enemigo.defensa();
		        }
		        
		        //Proceso a seguir segun la seleccion tanto del personaje como el enemigo
		        
		        if(danioPersonaje > 0 && danioEnemigo > 0) {
		        	if(jugador.getPokemon().getAgilidad() > enemigo.getAgilidad()) {
		        		
			        	golpe = calculadora.danioJugador(danioPersonaje, jugador.getPokemon(), enemigo);
		       		  	enemigo.setVidas(enemigo.getVidas() - golpe);
		       		  	
		       		  	if(enemigo.getVidas() < 0) {
		        			 if(!(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoActivo)){
		        				 jugador.getPokemon().getGestor().process(Estado.ACTIVO);
		        			 }		       		  		
		        			 break;
		       		  	}
		       		  	
		       		  	golpe = calculadora.danioEnemigo(danioEnemigo,enemigo,jugador.getPokemon());
		       		  	jugador.getPokemon().setVidas(jugador.getPokemon().getVidas() - golpe);   
		       		  	
		       		  	if(jugador.getPokemon().getVidas() <= 5 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoHerido)) {
		       		  		jugador.getPokemon().getGestor().process(Estado.HERIDO);
		       		  	}else if(golpe > 10 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoParalizado)){
		       		  		jugador.getPokemon().getGestor().process(Estado.PARALIZADO);
		       		  		jugador.getPokemon().setAgilidad(jugador.getPokemon().getAgilidad()-2);
		       		  	}
		       		  	if(jugador.getPokemon().getVidas() < 0) {
		       		  		break;
		       		  	}
		       		  	
		       		  	
		        	}else {
		        		golpe = calculadora.danioEnemigo(danioEnemigo,enemigo,jugador.getPokemon());
		       		  	jugador.getPokemon().setVidas(jugador.getPokemon().getVidas() - golpe);  
		       		  	
		       		  	if(jugador.getPokemon().getVidas() <= 5 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoHerido)) {
		       		  		jugador.getPokemon().getGestor().process(Estado.HERIDO);
		       		  	}else if(golpe > 10 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoParalizado) ){
		       		  		jugador.getPokemon().getGestor().process(Estado.PARALIZADO);
		       		  		jugador.getPokemon().setAgilidad(jugador.getPokemon().getAgilidad()-2);
		       		  	}
		       		  	
		       		  	if(jugador.getPokemon().getVidas() < 0) {
		       		  		break;
		       		  	}
		       		  	
		       		  	golpe = calculadora.danioJugador(danioPersonaje, jugador.getPokemon(), enemigo);
		       		  	enemigo.setVidas(enemigo.getVidas() - golpe);
		       		  	
		       		  	if(enemigo.getVidas() < 0) {
							 if(!(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoActivo)){
								 jugador.getPokemon().getGestor().process(Estado.ACTIVO);
							 }
		       		  		break;
		       		  	}
		       		  	
		        	}
		        }else if(danioPersonaje > 0 && danioEnemigo < 0) {
		        	
		        	 golpe = calculadora.danioJugador(danioPersonaje, jugador.getPokemon(), enemigo);
	        		 golpe = golpe + danioEnemigo;
	        		 enemigo.setVidas(enemigo.getVidas() - golpe);
	        		 
	        		 if(enemigo.getVidas() < 0) {
	        			 if(!(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoActivo)){
	        				 jugador.getPokemon().getGestor().process(Estado.ACTIVO);
	        			 }
	        			
	        			 break;
		       		  }
	        		 
		        }else if(danioPersonaje < 0 && danioEnemigo > 0) {
		        	golpe = calculadora.danioEnemigo(danioEnemigo,enemigo,jugador.getPokemon());
	       		    golpe = golpe + danioPersonaje;
	       		    jugador.getPokemon().setVidas(jugador.getPokemon().getVidas() - golpe); 
	       		    
	       		    if(jugador.getPokemon().getVidas() <= 5 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoHerido)) {
	    		  		jugador.getPokemon().getGestor().process(Estado.HERIDO);
	       		    }else if(golpe > 10 && !(jugador.getPokemon().getGestor().getEstadoActual() instanceof EstadoParalizado)){
	       		  		jugador.getPokemon().getGestor().process(Estado.PARALIZADO);
	       		  		jugador.getPokemon().setAgilidad(jugador.getPokemon().getAgilidad()-2);
	       		  	}
	       		    
	       		    if(jugador.getPokemon().getVidas() < 0) {
	    		  		break;
	    		  	}
		        }
		        
		        golpe = 0;  
			}
			
			if(jugador.getPokemon().getVidas() < enemigo.getVidas()) {
				System.out.println("Perdiste!!!!!!");
				resultado = false;
			}else {
				System.out.println("Has vencidoooo");
				jugador.getPokemon().setVidas(vida);
				resultado = true;
			}
	
		return resultado;
	}
	
	/**
	 * Cierra el scanner cuando el juego termina
	 */
	public void cerrarScanner() {
		 sc.close();
	}
	
	/**
	 * Crea el pokemon que corresponde en cada momento
	 * @param contadorPokemon
	 */
	public void createPokemon(int contadorPokemon) {
		switch(contadorPokemon) {
		case 0: this.enemigo = (Pokemon)crear.createBeldum();
		 break;
		case 1: this.enemigo = (Pokemon)crear.createGastly();
		 break;
		case 2: this.enemigo = (Pokemon)crear.createPichu();
		 break;
		case 3: this.enemigo = (Pokemon)crear.createPiplup();
		 break;
		case 4: this.enemigo = (Pokemon)crear.createRalts();
		 break;
		}
		
	}
}