package com.utad.designpatterns.enemigos.estrategias;

/**
 * Interfaz para las estrategias
 * @author rodri
 *
 */
public interface EnemigoStrategy {
	
	/**
	 * Probabilidad de ataque si es pasivo (menos probabilidad) o agresivo (más)
	 * @return
	 */
	public float getProbabilidadAtaque();
	/**
	 * Si es agresivo tiene más fuerza
	 * @return
	 */
	public float getFuerza();
	/**
	 * Si es agresivo tiene más agilidad
	 * @return
	 */
	public float getAgilidad();
	

}
