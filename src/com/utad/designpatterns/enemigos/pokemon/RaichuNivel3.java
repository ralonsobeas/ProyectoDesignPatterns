package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

public class RaichuNivel3 extends Pokemon{
	public RaichuNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza  * Nivel.Nivel3.getMultiplicador());
		this.setResistencia(resistencia  * Nivel.Nivel3.getMultiplicador());
		this.setAgilidad(agilidad  * Nivel.Nivel3.getMultiplicador());
		this.setVidas(vidas  * Nivel.Nivel3.getMultiplicador());
		this.setNivel(Nivel.Nivel3);
	}

	public String ataque() {
		// TODO Auto-generated method stub
		return "Trueno";
	}

	public String defensa() {
		// TODO Auto-generated method stub
		return "";
	}

}
