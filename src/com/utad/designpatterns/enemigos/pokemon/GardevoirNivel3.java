package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase viende de Ralts(Nivel1) y Kirlia(Nivel2)
 * @author rodri
 *
 */
public class GardevoirNivel3 extends Pokemon{
	
	public GardevoirNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel3);
	}


	public float ataque() {
		// TODO Auto-generated method stub
		//return "Beso Dulce";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
