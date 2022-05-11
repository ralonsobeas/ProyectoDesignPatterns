package com.utad.designpatterns.decorator;

/**
 * Interfaz para el patrón decorador
 * @author rodri
 *
 */
public interface AccionDecorator {
	public String getTipoMovimiento();
	public float getDanio();
	public float getDefensa();
}
