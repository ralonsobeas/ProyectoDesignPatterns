package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;

import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase evoluciona a Metang(Nivel2) y Metagross(Nivel3)
 * @author rodri
 *
 */
public class BeldumNivel1 extends Pokemon{
	
	public BeldumNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		System.out.println("-- Ataque --"); 
		System.out.println("Cabezazo Zen"); 
		return getFuerza()*this.getEstrategia().getFuerza();
	}

	public float defensa() {
		System.out.println("-- Defensa --"); 
		System.out.println("Defensa Zen");
		return -2;
	}

	
}
