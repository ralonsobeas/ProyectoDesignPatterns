package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase evoluciona a Metang(Nivel2) y Metagross(Nivel3)
 * @author rodri
 *
 */
public class BeldumNivel1 extends Pokemon{
	
	public BeldumNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel1);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Cabezazo Zen";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
