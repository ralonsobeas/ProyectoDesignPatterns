package com.utad.designpatterns.enemigos.estrategias;

/**
 * Interfaz para las estrategias
 * @author rodri
 *
 */
public interface EnemigoStrategy {
	
	/**
	 * Probabilidad de ataque si es pasivo (menos probabilidad) o agresivo (m�s)
	 * @return
	 */
	public float getProbabilidadAtaque();
	/**
	 * Si es agresivo tiene m�s fuerza
	 * @return
	 */
	public float getFuerza();
	/**
	 * Si es agresivo tiene m�s agilidad
	 * @return
	 */
	public float getAgilidad();
	

}
