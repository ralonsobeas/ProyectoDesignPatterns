package com.utad.designpatterns.decorator;

/**
 * Clase patrón decorador para un ataque base
 * @author rodri
 *
 */
public class AtaqueBase implements AccionBaseDecorator {

	private AccionDecorator accionDecorator;
	
	public AtaqueBase(AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Ataque Base";
	}

	public float getDanio() {
		return this.accionDecorator.getDanio();
	}

	public float getDefensa() {
		return 0;
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
