package com.utad.designpatterns.decorator;

/**
 * Clase patrón decorador para un ataque fuerte
 * @author rodri
 *
 */
public class AtaqueFuerte implements AccionBaseDecorator {

	private AccionDecorator accionDecorator;
	
	public AtaqueFuerte(AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Ataque Fuerte";
	}

	public float getDanio() {
		return this.accionDecorator.getDanio()+4;
	}

	public float getDefensa() {
		return 0;
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
