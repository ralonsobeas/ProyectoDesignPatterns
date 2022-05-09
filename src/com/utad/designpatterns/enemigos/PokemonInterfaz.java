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
	public Integer getFuerza();
	public void setFuerza(Integer fuerza);
	public Integer getResistencia();
	public void setResistencia(Integer resistencia);
	public Integer getAgilidad();
	public void setAgilidad(Integer agilidad);
	public Integer getVidas();
	public void setVidas(Integer vidas);
	public Nivel getNivel();

	
}
