package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase viene de Hunter(Nivel1) y evoluciona a Gengar(Nivel3)
 * @author rodri
 *
 */
public class HunterNivel2 extends Pokemon{
	public HunterNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel2);
	}

	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Bola Sombra"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Bola Sombra Defensiva"); 
		return -2;
	}
}
