package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Pikachu evoluciona a Raichu(nivel 3)
 * @author david
 *
 */
public class PikachuNivel2 extends Pokemon{
	public PikachuNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel2);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Rayo");
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Rayo Defensivo");
		return -2;
	}

}
