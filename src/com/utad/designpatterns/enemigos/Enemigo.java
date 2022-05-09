package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.enemigos.estrategias.EnemigoStrategy;

/**
 * 
 * Clase enemigo que utiliza el patrón Template Method para implementar el algoritmo para decidir la siguiente acción a realizar.
 * @author rodri
 *
 */
public abstract class Enemigo {
	
	//Atributo enemigo
	private float fuerza;
	private float resistencia;
	private float agilidad;
	
	//Estrategia del enemigo
	private EnemigoStrategy estrategia; //Composición por agregación
	
	//Se deja por implementar para que cada enemmigo haga sus ataques o defensas
	public abstract float ataque();
	public abstract void defensa();
	
	/**
	 * Elegir siguiente movimiento final?
	 */
	public Movimiento siguienteMovimiento() {
		
		float random = (float)(Math.random());
		
		if(random<=this.estrategia.getProbabilidadAtaque()) {
			return Movimiento.ATACAR;
		}
		
		return Movimiento.DEFENDER;
		
	}

	//Getters y setters 
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
