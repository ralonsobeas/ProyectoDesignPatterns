package com.utad.designpatterns.enemigos.estrategias;

/**
 * Clase estrategia para enemigo agresivo
 * @author david xia
 *
 */
public class DefensivoStrategy implements EnemigoStrategy{
	
	public float probabilidadAtaque = 0.3f;
	public float fuerza = 1.0f;
	public float agilidad = 0.1f;

	/**
	 * Recoge la probabilidad de ataque del enemigo
	 */
	public float getProbabilidadAtaque() {
		return this.probabilidadAtaque;
	}

	/**
	 * Recoge la fuerza del enemigo
	 */
	public float getFuerza() {
		return this.fuerza;
	}

	/**
	 * Recoge la agilidad del enemigo
	 */
	public float getAgilidad() {
		return this.agilidad;
	}

}
