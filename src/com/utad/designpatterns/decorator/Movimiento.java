package com.utad.designpatterns.decorator;

import com.utad.designpatterns.enemigos.Pokemon;

/**
 * Clase que gestiona los movimientos
 * @author rodri
 *
 */
public class Movimiento implements AccionDecorator {

	public Pokemon pokemon;
	
	public Movimiento(Pokemon pokemon) {
		this.pokemon=pokemon;
	}
	
	public Movimiento() {}
	
	public String getTipoMovimiento() {
		return null;
	}
	
	public float getDanio() {
		return this.pokemon.getFuerza();
	}
	
	public float getDefensa() {
		return this.pokemon.getResistencia();
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon=pokemon;
	}

}
