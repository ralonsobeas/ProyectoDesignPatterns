package com.utad.designpatterns.mundos;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.TipoPokemonAbstractFactory;
import com.utad.designpatterns.enemigos.pokemon.BeldumNivel1;
import com.utad.designpatterns.enemigos.pokemon.GastlyNivel1;
import com.utad.designpatterns.enemigos.pokemon.PichuNivel1;
import com.utad.designpatterns.enemigos.pokemon.PiplupNivel1;
import com.utad.designpatterns.enemigos.pokemon.RaltsNivel1;

public class Nivel1AbstractFactory implements TipoPokemonAbstractFactory{
	
	public Nivel1AbstractFactory() {
		super();
	}
	
	@Override
	public Pokemon createPiplup() {
		Pokemon piplup = new PiplupNivel1("Piplup",4,12,10,12);
		return piplup;
	}

	@Override
	public Pokemon createBeldum() {
		Pokemon beldum = new BeldumNivel1("Beldum",6,10,5,12);
		return beldum;
	}

	@Override
	public Pokemon createPichu() {
		Pokemon pichu = new PichuNivel1("Pichu",5,4,15,12);
		return pichu;
	}

	@Override
	public Pokemon createRalts() {
		Pokemon ralts = new RaltsNivel1("Ralts",6,5,10,12);
		return ralts;
	}

	@Override
	public Pokemon createGastly() {
		Pokemon gastly = new GastlyNivel1("Gastly",8,3,4,12);
		return gastly;
	}
	
	
	
}
