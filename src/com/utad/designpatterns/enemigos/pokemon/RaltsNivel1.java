package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Ralts evoluciona a kirlia ( nivel 2) y a Gardevor(nivel 3)
 * @author david
 *
 */
public class RaltsNivel1 extends Pokemon{
	public RaltsNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza  * Nivel.Nivel1.getMultiplicador());
		this.setResistencia(resistencia  * Nivel.Nivel1.getMultiplicador());
		this.setAgilidad(agilidad  * Nivel.Nivel1.getMultiplicador());
		this.setVidas(vidas  * Nivel.Nivel1.getMultiplicador());
		this.setNivel(Nivel.Nivel1);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Confusion";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}
}
