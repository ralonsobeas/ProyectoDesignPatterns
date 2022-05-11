package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;


/**
 * Esta clase viende de Gastly(Nivel1) y Haunter(Nivel2)
 * @author rodri
 *
 */
public class GengarNivel3 extends Pokemon{
	public GengarNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel3);
	}

	public float ataque() {
		System.out.println("-- Ataque --"); 
		System.out.println("Garra Umbria"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --");
		System.out.println("Posición de defensa"); 
		return -2;
	}

}
