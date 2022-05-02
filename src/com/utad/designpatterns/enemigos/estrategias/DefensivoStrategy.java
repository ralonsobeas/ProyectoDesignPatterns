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

	//recoge la probabilidad de ataque del enemigo
	public float getProbabilidadAtaque() {
		return this.probabilidadAtaque;
	}

	//recoge la fuerza del enemigo
	public float getFuerza() {
		return this.fuerza;
	}

	//recoge la agilidad del enemigo
	public float getAgilidad() {
		return this.agilidad;
	}

}
