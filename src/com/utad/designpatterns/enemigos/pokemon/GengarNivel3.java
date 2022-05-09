package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.enemigos.PokemonInterfaz;
import com.utad.designpatterns.mundos.Nivel;


/**
 * Esta clase viende de Gastly(Nivel1) y Haunter(Nivel2)
 * @author rodri
 *
 */
public class GengarNivel3 extends Pokemon{
	public GengarNivel3(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.setNombre(nombre);
		this.setFuerza(fuerza  * Nivel.Nivel3.getMultiplicador());
		this.setResistencia(resistencia  * Nivel.Nivel3.getMultiplicador());
		this.setAgilidad(agilidad  * Nivel.Nivel3.getMultiplicador());
		this.setVidas(vidas  * Nivel.Nivel3.getMultiplicador());
		this.setNivel(Nivel.Nivel3);
	}

	public float ataque() {
		// TODO Auto-generated method stub
		//return "Garra Umbria";
		return 0;
	}

	public float defensa() {
		// TODO Auto-generated method stub
		return 0;
	}

}
