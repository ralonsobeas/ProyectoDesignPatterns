package com.utad.designpatterns.decorator;

public class DefensaBase implements AccionBaseDecorator{

	private AccionDecorator accionDecorator;
	
	public DefensaBase (AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Defensa Base";
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
