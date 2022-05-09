package com.utad.designpatterns.mundos;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.TipoPokemonAbstractFactory;
import com.utad.designpatterns.enemigos.pokemon.EmpoleonNivel3;
import com.utad.designpatterns.enemigos.pokemon.GardevoirNivel3;
import com.utad.designpatterns.enemigos.pokemon.GengarNivel3;
import com.utad.designpatterns.enemigos.pokemon.MetagrossNivel3;
import com.utad.designpatterns.enemigos.pokemon.RaichuNivel3;

public class Nivel3AbstractFactory implements TipoPokemonAbstractFactory{
	public Nivel3AbstractFactory() {
		super();
	}
	
	@Override
	public Pokemon createPiplup() {
		Pokemon empoleon = new EmpoleonNivel3("Empoleon",4,12,10,12);
		return empoleon;
	}

	@Override
	public Pokemon createBeldum() {
		Pokemon metagross = new MetagrossNivel3("Metagross",6,10,5,12);
		return metagross;
	}

	@Override
	public Pokemon createPichu() {
		Pokemon raichu = new RaichuNivel3("Raichu",5,4,15,12);
		return raichu;
	}

	@Override
	public Pokemon createRalts() {
		Pokemon gardevoir = new GardevoirNivel3("Gardevoir",6,5,10,12);
		return gardevoir;
	}

	@Override
	public Pokemon createGastly() {
		Pokemon gengar = new GengarNivel3("Gengar",8,3,4,12);
		return gengar;
	}
}