package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.mundos.Nivel1AbstractFactory;

/**
 * Clase contexto para crear pokemons
 * @author rodri
 *
 */
public class ContextoCrear {
	private TipoPokemonAbstractFactory tipoPokemonAbstractFactory;
	private static ContextoCrear contextoCrear = new ContextoCrear(new Nivel1AbstractFactory());
	
	private ContextoCrear(TipoPokemonAbstractFactory tipoPokemonAbstractFactory) {
		this.tipoPokemonAbstractFactory = tipoPokemonAbstractFactory;
	}
	public static ContextoCrear getInstance() {
		return contextoCrear;
	}
	public TipoPokemonAbstractFactory getTipoPokemonAbstractFactory() {
		return tipoPokemonAbstractFactory;
	}
	public void setTipoPokemonAbstractFactory(TipoPokemonAbstractFactory tipoPokemonAbstractFactory) {
		this.tipoPokemonAbstractFactory = tipoPokemonAbstractFactory;
	}
	public PokemonInterfaz createPiplup() {
		return this.tipoPokemonAbstractFactory.createPiplup();
	}
	public PokemonInterfaz createBeldum() {
		return this.tipoPokemonAbstractFactory.createBeldum();
	}
	public PokemonInterfaz createPichu() {
		return this.tipoPokemonAbstractFactory.createPichu();
	}
	public PokemonInterfaz createGastly() {
		return this.tipoPokemonAbstractFactory.createGastly();
	}
	public PokemonInterfaz createRalts() {
		return this.tipoPokemonAbstractFactory.createRalts();
	}
}
