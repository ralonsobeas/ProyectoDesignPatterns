package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Raichu : La ultima evolucion de pikachu y pichu
 * @author david
 *
 */

public class RaichuNivel3 extends Pokemon{
	public RaichuNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel3);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Trueno");
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Trueno Defensivo");
		return -2;
	}

}
