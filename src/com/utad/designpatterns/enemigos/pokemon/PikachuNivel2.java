package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.mundos.Nivel;

public class PikachuNivel2 implements Pokemon{
	private String name;
	private Integer fuerza;
	private Integer resistencia;
	private Integer agilidad;
	private Integer vidas;
	
	public PikachuNivel2(String name, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.name = name;
		this.fuerza = fuerza  * Nivel.Nivel2.getMultiplicador();
		this.resistencia = resistencia  * Nivel.Nivel2.getMultiplicador();
		this.agilidad = agilidad  * Nivel.Nivel2.getMultiplicador();
		this.vidas = vidas  * Nivel.Nivel2.getMultiplicador();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Integer getFuerza() {
		// TODO Auto-generated method stub
		return fuerza;
	}

	@Override
	public Integer getResistencia() {
		// TODO Auto-generated method stub
		return resistencia;
	}

	@Override
	public Integer getAgilidad() {
		// TODO Auto-generated method stub
		return agilidad;
	}

	@Override
	public Integer getVidas() {
		// TODO Auto-generated method stub
		return vidas;
	}

	@Override
	public Nivel getNivel() {
		// TODO Auto-generated method stub
		return Nivel.Nivel2;
	}

	@Override
	public String getAtaqueEspecial() {
		// TODO Auto-generated method stub
		return "Rayo";
	}

}
