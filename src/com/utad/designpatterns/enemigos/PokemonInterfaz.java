package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.mundos.Nivel;

/**
 * Interfaz para la clase abstracta Pokemon
 * @author rodri
 *
 */
public interface PokemonInterfaz {
	
	public float ataque();
	public float defensa();
	public Movimiento siguienteMovimiento();
	
	public String getNombre();
	public float getFuerza();
	public void setFuerza(float fuerza);
	public float getResistencia();
	public void setResistencia(float resistencia);
	public float getAgilidad();
	public void setAgilidad(float agilidad);
	public float getVidas();
	public void setVidas(float vidas);
	public Nivel getNivel();

	
}
