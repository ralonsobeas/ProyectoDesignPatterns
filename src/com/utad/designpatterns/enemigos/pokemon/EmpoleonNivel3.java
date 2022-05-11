package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;


/**
 * Esta clase viene de a Piplup(Nivel1) y Prinplup(Nivel2)
 * @author rodri
 *
 */
public class EmpoleonNivel3 extends Pokemon {
	
	public EmpoleonNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel3);
	}


	public float ataque() {
		System.out.println("-- Ataque --");
		System.out.println("Hidrobomba"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --"); 
		System.out.println("Agua defensiva"); 
		return -2;
	}
}
