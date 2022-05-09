package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Pichu evluciona a Pikachu (nivel 2) y a raichu(Nivel 3)
 * @author david
 *
 */
public class PichuNivel1 extends Pokemon{
	public PichuNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Impactrueno";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}

