package com.utad.designpatterns.decorator;

import com.utad.designpatterns.enemigos.Pokemon;

public interface AccionDecorator {
	
	public String getTipoMovimiento();
	public float getDanio();
	public float getDefensa();
	
}
