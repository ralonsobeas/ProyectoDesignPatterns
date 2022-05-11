package com.utad.designpatterns.contoladores;
import com.utad.designpatterns.enemigos.*;
import com.utad.designpatterns.enemigos.estrategias.*;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Clase calculadora que realiza las tareas de cálculo del juego
 * @author rodri
 *
 */
public class Calculadora {
	
	/**
	 * Seleccina la estrategia que va a seguir el pokemon enemigo durante el combate
	 * @param pokemon
	 */
	public void strategy(Pokemon pokemon) {
		
		EnemigoStrategy strategy;
		float random = (float)(Math.random() * 100);
		
		if(random<=50 ) {
			strategy = new AgresivoStrategy();
			pokemon.setEstrategia(strategy);
		}else {
			strategy = new DefensivoStrategy();
			pokemon.setEstrategia(strategy);
		}
		
	}
	
	/**
	 * Singleton calculadora
	 */
	private static Calculadora calculadora;
	private Calculadora(){} //privado
	
	public static Calculadora getInstance(){
		
		if (calculadora==null){
			calculadora = new Calculadora();
		}
		return calculadora;
		
	}
	
	/**
	 * Calcula el golpe que pega el enemigo
	 * @param danio
	 * @param pokemonAtaca
	 * @param pokemonDefiende
	 * @return
	 */
	public float danioEnemigo(float danio, PokemonInterfaz pokemonAtaca,PokemonInterfaz pokemonDefiende ) {
		float golpe = 0;
		
		golpe = pokemonAtaca.getFuerza() + danio;
		
		if(pokemonDefiende.getResistencia() > golpe) {
			golpe = danio/2;
		}else {
			golpe = (pokemonAtaca.getFuerza() + danio)/2;
			
		}
		
		
		return golpe;
	}
	
	/**
	 * Calcula el golpe que pega el persobnaje
	 * @param danio
	 * @param pokemonAtaca
	 * @param pokemonDefiende
	 * @return
	 */
	public float danioJugador(float danio, PokemonInterfaz pokemonAtaca,PokemonInterfaz pokemonDefiende) {
		float golpe = 0;
		
		golpe = danio;
		
		if(pokemonDefiende.getResistencia() > golpe) {
			golpe = danio/2;
		}else {
			golpe = danio - pokemonDefiende.getResistencia()/2;
			
		}
		
		
		
		return golpe;
	}
	
	/**
	 * Calcula la probabilidad de paralizarse
	 * @param pokemon
	 * @return
	 */
	public boolean paralizar(PokemonInterfaz pokemon) {
		boolean paralizado = false;
		
		int random = 0;
		
		if(pokemon.getNivel().equals(Nivel.Nivel1)) {
			random = (int)(Math.random()* 10);
		}else if(pokemon.getNivel().equals(Nivel.Nivel2)) {
			random = (int)(Math.random() * 30);
		}else {
			random = (int)(Math.random() * 50);
		}
		
		if(random <= pokemon.getAgilidad()) {
			paralizado = false;
		}else {
			paralizado = true;
		}
		
		return paralizado;
	}
	
}
