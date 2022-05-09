package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

public class BeldumNivel1 extends Pokemon{
	
	public BeldumNivel1(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza  * Nivel.Nivel1.getMultiplicador());
		this.setResistencia(resistencia  * Nivel.Nivel1.getMultiplicador());
		this.setAgilidad(agilidad  * Nivel.Nivel1.getMultiplicador());
		this.setVidas(vidas  * Nivel.Nivel1.getMultiplicador());
		this.setNivel(Nivel.Nivel1);
	}

	public String ataque() {
		// TODO Auto-generated method stub
		return "Cabezazo Zen";
	}

	public String defensa() {
		// TODO Auto-generated method stub
		return "";
	}

	
}
