package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Piplup evoluciona a Prinplup (nivel 2 ) Y Empolion (nivel 3)
 * @author david
 *
 */
public class PiplupNivel1 extends Pokemon{
	public PiplupNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Pistola Agua");
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Pistola Agua Defensiva");
		return -2;
	}
}
