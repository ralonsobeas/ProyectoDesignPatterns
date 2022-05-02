package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Enemigo;

/**
 * Enemigo Empolion
 * @author david
 *
 */
public class Empolion extends Enemigo{

	/**
	 * Ataque de Empolion
	 */
	public float ataque() {
		return this.getFuerza() * this.getEstrategia().getFuerza();
	}
	
	/**
	 * Defensa de Empolion
	 */
	public void defensa() {
		this.setResistencia(getResistencia()*4);
	}
	
	
	

}
