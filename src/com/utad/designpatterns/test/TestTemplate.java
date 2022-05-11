package com.utad.designpatterns.test;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.enemigos.pokemon.BeldumNivel1;
import com.utad.designpatterns.enemigos.pokemon.PiplupNivel1;

/**
 * Clase test para el patrón Template
 * @author rodri
 *
 */
public class TestTemplate {

	public static void main(String[] args) {
		
		//Crear dos pokemon
		PokemonInterfaz beldum = new BeldumNivel1("Beldum",6,10,5,12);	
		PokemonInterfaz piplup = new PiplupNivel1("Piplup",4,12,10,12);
		
		//Aunque utilicen el mismo método, es random así que pueden dar resultados diferentes
		System.out.println("Siguiente movimiento beldum: "+beldum.siguienteMovimiento());
		System.out.println("Siguiente movimiento piplup: "+piplup.siguienteMovimiento());
		
		//Implementaciones diferentes en mismos métodos
		System.out.println("Ataque beldum: "+beldum.ataque());
		System.out.println("Ataque piplup: "+piplup.ataque());
		
		System.out.println("Defensa beldum: "+beldum.defensa());
		System.out.println("Defensa piplup: "+piplup.defensa());
	}

}
