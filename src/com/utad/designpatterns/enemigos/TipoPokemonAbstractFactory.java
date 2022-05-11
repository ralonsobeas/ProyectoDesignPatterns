package com.utad.designpatterns.enemigos;

/**
 * Interfaz para el patrón abstract factory
 * @author rodri
 *
 */
public interface TipoPokemonAbstractFactory{
	public PokemonInterfaz createPiplup();
	public PokemonInterfaz createBeldum();
	public PokemonInterfaz createPichu();
	public PokemonInterfaz createRalts();
	public PokemonInterfaz createGastly();
}
