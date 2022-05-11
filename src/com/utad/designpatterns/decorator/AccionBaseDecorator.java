package com.utad.designpatterns.decorator;

/**
 * Interfaz para el patrón decorador base
 * @author rodri
 *
 */
public interface AccionBaseDecorator extends AccionDecorator{
	public AccionDecorator getAccionDecorator();

}
