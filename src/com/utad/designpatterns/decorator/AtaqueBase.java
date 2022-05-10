package com.utad.designpatterns.decorator;

public class AtaqueBase implements AccionBaseDecorator {

	private AccionDecorator accionDecorator;
	
	public AtaqueBase(AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Ataque Base";
	}

	public float getDaño() {
		return this.accionDecorator.getDaño();
	}

	public float getDefensa() {
		return this.accionDecorator.getDefensa();
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
