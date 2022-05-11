package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Prinplup evoluciona a Empolion (nivel 3)
 * @author david
 *
 */
public class PrinplupNivel2 extends Pokemon{
	public PrinplupNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel2);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Rayo Burbuja");
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Rayo Burbuja Defensivo");
		return -2;
	}
}
