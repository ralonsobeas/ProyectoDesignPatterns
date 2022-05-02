package com.utad.designpatterns.enemigos;

/**
 * Estrategia para enemigos
 * @author rodri
 *
 */
public class EnemigoStrategyContext implements EnemigoStrategy {
	
	private Enemigo enemigo;

	@Override
	public float getProbabilidadAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getFuerza() {
		return this.enemigo.getFuerza();
	}

	@Override
	public float getAgilidad() {
		return this.enemigo.getAgilidad();
	}

}
