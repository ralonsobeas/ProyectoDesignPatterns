package com.utad.designpatterns.decorator;

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
		return this.accionDecorator.getDefensa();
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
