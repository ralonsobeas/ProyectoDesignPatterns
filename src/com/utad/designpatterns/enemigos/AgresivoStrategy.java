package com.utad.designpatterns.enemigos;

/**
 * Clase estrategia para enemigo agresivo
 * @author rodri
 *
 */
public class AgresivoStrategy implements EnemigoStrategy{
	
	public float probabilidadAtaque = 0.6f;
	public float fuerza = 2.5f;
	public float agilidad = 0.3f;

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
