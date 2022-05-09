package com.utad.designpatterns.mundos;

import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.enemigos.TipoPokemonAbstractFactory;
import com.utad.designpatterns.enemigos.pokemon.HunterNivel2;
import com.utad.designpatterns.enemigos.pokemon.KirliaNivel2;
import com.utad.designpatterns.enemigos.pokemon.MetangNivel2;
import com.utad.designpatterns.enemigos.pokemon.PikachuNivel2;
import com.utad.designpatterns.enemigos.pokemon.PrinplupNivel2;

public class Nivel2AbstractFactory implements TipoPokemonAbstractFactory{

	public Nivel2AbstractFactory() {
		super();
	}
	
	@Override
	public PokemonInterfaz createPiplup() {
		PokemonInterfaz prinplup = new PrinplupNivel2("Prinplup",4,12,10,12);
		return prinplup;
	}

	@Override
	public PokemonInterfaz createBeldum() {
		PokemonInterfaz metang = new MetangNivel2("Metang",6,10,5,12);
		return metang;
	}

	@Override
	public PokemonInterfaz createPichu() {
		PokemonInterfaz pikachu = new PikachuNivel2("Pikachu",5,4,15,12);
		return pikachu;
	}

	@Override
	public PokemonInterfaz createRalts() {
		PokemonInterfaz kirlia = new KirliaNivel2("Kirlia",6,5,10,12);
		return kirlia;
	}

	@Override
	public PokemonInterfaz createGastly() {
		PokemonInterfaz hunter = new HunterNivel2("Hunter",8,3,4,12);
		return hunter;
	}

}
