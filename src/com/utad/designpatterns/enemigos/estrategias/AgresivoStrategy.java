package com.utad.designpatterns.enemigos.estrategias;

/**
 * Clase estrategia para enemigo agresivo
 * @author rodri
 *
 */
public class AgresivoStrategy implements EnemigoStrategy{
	
	public float probabilidadAtaque = 0.6f;
	public float fuerza = 2.5f;
	public float agilidad = 0.3f;
	
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
