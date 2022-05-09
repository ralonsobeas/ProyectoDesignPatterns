package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase viene de Beldum(Nivel1) y Metang(Nivel2)
 * @author rodri
 *
 */
public class MetagrossNivel3 extends Pokemon{
	public MetagrossNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super(nombre,fuerza,resistencia,agilidad,vidas,Nivel.Nivel3);
	}


	public float ataque() {
		// TODO Auto-generated method stub
		//return "Psiquico";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}

}
