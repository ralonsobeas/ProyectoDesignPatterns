package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase viene de Ralts(Nivel1) y evoluciona a Gardevoir(Nivel3)
 * @author rodri
 *
 */
public class KirliaNivel2 extends Pokemon{
	public KirliaNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel2);
	}


	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Psiquico"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Psiquico Defensivo"); 
		return -2;
	}
}
