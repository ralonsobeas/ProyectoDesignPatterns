package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Esta clase viene de Hunter(Nivel1) y evoluciona a Gengar(Nivel3)
 * @author rodri
 *
 */
public class HunterNivel2 extends Pokemon{
	public HunterNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza  * Nivel.Nivel2.getMultiplicador());
		this.setResistencia(resistencia  * Nivel.Nivel2.getMultiplicador());
		this.setAgilidad(agilidad  * Nivel.Nivel2.getMultiplicador());
		this.setVidas(vidas  * Nivel.Nivel2.getMultiplicador());
		this.setNivel(Nivel.Nivel2);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Bola Sombra";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
