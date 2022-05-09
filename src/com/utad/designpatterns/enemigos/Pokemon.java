package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.mundos.Nivel;

public interface Pokemon {
	public String getName();
	public Integer getFuerza();
	public Integer getResistencia();
	public Integer getAgilidad();
	public Integer getVidas();
	public Nivel getNivel();
	public String getAtaqueEspecial();
	
}
