package com.utad.designpatterns.enemigos;

/**
 * Clase estrategia para enemigo agresivo
 * @author david xia
 *
 */
public class DefensivoStrategy implements EnemigoStrategy{
	
	public float probabilidadAtaque = 0.3f;
	public float fuerza = 1.0f;
	public float agilidad = 0.1f;

	public float getProbabilidadAtaque() {
		return this.probabilidadAtaque;
	}

	public float getFuerza() {
		return this.fuerza;
	}

	public float getAgilidad() {
		return this.agilidad;
	}

}
