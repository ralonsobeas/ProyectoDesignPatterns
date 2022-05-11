package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Ralts evoluciona a kirlia ( nivel 2) y a Gardevor(nivel 3)
 * @author david
 *
 */
public class RaltsNivel1 extends Pokemon{
	public RaltsNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Confusion");
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Confusion Defensivo");
		return -2;
	}
}
