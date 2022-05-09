package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;

/**
 * Metang evoluciona a Metagross (nivel 3)
 * @author david
 *
 */

public class MetangNivel2 extends Pokemon{
	public MetangNivel2(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
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
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}

}
