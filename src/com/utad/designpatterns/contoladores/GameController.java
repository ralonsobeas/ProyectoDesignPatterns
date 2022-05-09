package com.utad.designpatterns.contoladores;
import com.utad.designpatterns.enemigos.*;
import com.utad.designpatterns.mundos.*;
import com.utad.designpatterns.jugador.*;

import java.util.Scanner;
/**
 * Clase GameController
 * @author rodri
 *
 */
public class GameController {
	
	
	private Jugador jugador = new Jugador();
	//private Calculadora calculadora = new Calculadora();
		//mundoEnElQueEsta
	private Pokemon enemigo;
	private ContextoCrear crear = ContextoCrear.getInstance(); 
	private int contadorPokemon = 0;
	
	//Patrón Singleton
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

		public void create_personaje() {
			String entradaTeclado;
	        Scanner sc = new Scanner (System.in); //Creaci�n de un objeto Scanner
	        entradaTeclado = sc.nextLine (); 
	        jugador.setName(entradaTeclado);
			
			System.out.println("Bienvenido " + jugador.getName());
			System.out.println("Que pokemon quieres como tu inicial: ");
			System.out.println("1_ Beldum\n 2_ Gastly\n 3_ Pichu\n 4_ Piplup\n 5_ Ralts\n");
			entradaTeclado = sc.nextLine();
			switch(entradaTeclado) {
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
			
			System.out.println("A elegido a: " + jugador.getPokemon().getNombre());
			sc.close();
	
		
			
		}
		
		public void changeWorld() {
			
			if(jugador.getPokemon().getNivel() == Nivel.Nivel1) {
				crear.setTipoPokemonAbstractFactory(new Nivel2AbstractFactory());
				switch(jugador.getPokemon().getNombre()) {
					case "Beldum": jugador.setPokemon((Pokemon)crear.createBeldum()); 
						 System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Gastly": jugador.setPokemon((Pokemon)crear.createGastly()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Pichu": jugador.setPokemon((Pokemon)crear.createPichu());
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Piplup": jugador.setPokemon((Pokemon)crear.createPiplup()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Ralts": jugador.setPokemon((Pokemon)crear.createRalts()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
				}
			}else if(jugador.getPokemon().getNivel() == Nivel.Nivel2) {
				crear.setTipoPokemonAbstractFactory(new Nivel3AbstractFactory());
				switch(jugador.getPokemon().getNombre()) {
					case "Metang": jugador.setPokemon((Pokemon)crear.createBeldum()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Hunter": jugador.setPokemon((Pokemon)crear.createGastly()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Pikachu": jugador.setPokemon((Pokemon)crear.createPichu()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Prinplup": jugador.setPokemon((Pokemon)crear.createPiplup()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
					case "Kirlia": jugador.setPokemon((Pokemon)crear.createRalts()); 
						System.out.println("�Tu pokemon esta evolucionando...!!\n A evolucionado a: " + jugador.getPokemon().getNombre());
					 break;
				}
			}
		}
		
		public void Combat() {
			do {
				createPokemon(contadorPokemon);
				this.enemigo.getNombre();
				contadorPokemon++;
			}while(this.enemigo.getNombre() == jugador.getPokemon().getNombre());
				
			
			System.out.println("Primer combate");
			//calculadora.strategy(enemigo);
			//boolean resultado = false;
			
			System.out.println(jugador.getName() + " saca a: " + jugador.getPokemon().getNombre() + " se enfrenta a: " + enemigo.getNombre());
			
			//while(resultado == false) {
				
			//}
			
			//*if(/*personaje.getpokemon().estado != muerto && contador pokemon == 4*/ ){
				changeWorld();
			//}
			
			
		}
		
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