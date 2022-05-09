package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Piplup evoluciona a Prinplup (nivel 2 ) Y Empolion (nivel 3)
 * @author david
 *
 */
public class PiplupNivel1 extends Pokemon{
	public PiplupNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Pistola Agua";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
