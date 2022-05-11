package com.utad.designpatterns.test;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.estrategias.AgresivoStrategy;
import com.utad.designpatterns.enemigos.estrategias.EnemigoStrategy;
import com.utad.designpatterns.enemigos.pokemon.BeldumNivel1;

/**
 * Clase test para el patrón strategy
 * @author rodri
 *
 */
public class TestStrategy {
	
	public static void main(String[] args) {
		//Crear pokemon normal
		Pokemon beldum = new BeldumNivel1("Beldum",6,10,5,12);
		//Ataque normal
		System.out.println("Fuerza: "+beldum.ataque());
		
		//Añadir estrategia agresivo
		EnemigoStrategy strategy = new AgresivoStrategy();
		beldum.setEstrategia(strategy);
		
		//Ataque agresivo
		System.out.println("Fuerza: "+beldum.ataque());
		
	}

}
