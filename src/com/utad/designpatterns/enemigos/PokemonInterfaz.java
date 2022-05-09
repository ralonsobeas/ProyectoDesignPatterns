package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.mundos.Nivel;

public interface PokemonInterfaz {
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
