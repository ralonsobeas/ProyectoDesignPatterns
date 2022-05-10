package com.utad.designpatterns.decorator;

public class AtaqueFuerte implements AccionBaseDecorator {

	private AccionDecorator accionDecorator;
	
	public AtaqueFuerte(AccionDecorator accionDecorator) {
		this.accionDecorator=accionDecorator;
	}
	
	public String getTipoMovimiento() {
		return "Ataque Fuerte";
	}

	public float getDanio() {
		return this.accionDecorator.getDanio()+1;
	}

	public float getDefensa() {
		return this.accionDecorator.getDefensa();
	}

	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

}
