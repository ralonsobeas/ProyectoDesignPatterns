package com.utad.designpatterns.enemigos.pokemon;

import com.utad.designpatterns.enemigos.Pokemon;
import com.utad.designpatterns.mundos.Nivel;

public class BeldumNivel1 implements Pokemon {
	private String name;
	private Integer fuerza;
	private Integer resistencia;
	private Integer agilidad;
	private Integer vidas;
	
	public BeldumNivel1(String name, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas) {
		super();
		this.name = name;
		this.fuerza = fuerza  * Nivel.Nivel1.getMultiplicador();
		this.resistencia = resistencia  * Nivel.Nivel1.getMultiplicador();
		this.agilidad  = agilidad  * Nivel.Nivel1.getMultiplicador();
		this.vidas = vidas  * Nivel.Nivel1.getMultiplicador();
	}
	

	@Override
	public String getName() {
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
		return Nivel.Nivel1;
	}

	
	public String getAtaqueEspecial() {
		// TODO Auto-generated method stub
		return "Cabezazo Zen";
	}
	
	public String getDefensaEspecial() {
		// TODO Auto-generated method stub
		return null;
	}
}
