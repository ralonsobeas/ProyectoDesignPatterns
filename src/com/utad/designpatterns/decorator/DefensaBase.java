package com.utad.designpatterns.decorator;

/**
 * Clase patrón decorador para una defensa base
 * @author rodri
 *
 */
public class DefensaBase implements AccionBaseDecorator{

	private AccionDecorator accionDecorator;
	
	public DefensaBase (AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Defensa Base";
	}

	public float getDanio() {
		return -2;
	}

	public float getDefensa() {
		return this.accionDecorator.getDefensa();
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
