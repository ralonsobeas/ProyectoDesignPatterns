package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Enemigo;

/**
 * Enemigo Picachu
 * @author rodri
 *
 */
public class Pikachu extends Enemigo{

	/**
	 * Ataque de Pikachu
	 */
	public float ataque() {
		return this.getFuerza() * this.getEstrategia().getFuerza();
	}
	
	/**
	 * Defensa de Pikachu
	 */
	public void defensa() {
		this.setResistencia(getResistencia()*2);
	}
	
	
	

}
