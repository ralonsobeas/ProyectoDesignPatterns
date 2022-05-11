package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase evoluciona a Haunter(Nivel2) y Gengar(Nivel3)
 * @author rodri
 *
 */
public class GastlyNivel1 extends Pokemon {
	public GastlyNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}


	public float ataque() {
		System.out.println("-- Ataque --"); 
		System.out.println("Persecucion"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Huida"); 
		return -2;
	}
}
