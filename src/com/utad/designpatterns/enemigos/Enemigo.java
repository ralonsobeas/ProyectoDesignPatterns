package com.utad.designpatterns.enemigos;

/**
 * 
 * Clase enemigo que utiliza el patrón Template Method para implementar el algoritmo para decidir la siguiente acción a realizar.
 * @author rodri
 *
 */
public abstract class Enemigo {
	
	private float fuerza;
	private float resistencia;
	private float agilidad;
	
	private EnemigoStrategy estrategia;
	
	public abstract float ataque();
	
	public void siguienteMovimiento() {
		
	}

	public float getFuerza() {
		return fuerza;
	}

	public void setFuerza(float fuerza) {
		this.fuerza = fuerza;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public float getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(float agilidad) {
		this.agilidad = agilidad;
	}

	public EnemigoStrategy getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EnemigoStrategy estrategia) {
		this.estrategia = estrategia;
	}

	
	
}
