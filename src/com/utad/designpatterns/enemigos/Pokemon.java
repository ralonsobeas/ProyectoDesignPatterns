package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.enemigos.estrategias.EnemigoStrategy;
import com.utad.designpatterns.mundos.Nivel;

/**
 * 
 * Clase enemigo que utiliza el patrón Template Method para implementar el algoritmo para decidir la siguiente acción a realizar.
 * @author rodri
 *
 */
public abstract class Pokemon implements PokemonInterfaz {
	
	//Atributo enemigo
	private String nombre;
	private Integer fuerza;
	private Integer resistencia;
	private Integer agilidad;
	private Integer vidas;
	private Nivel nivel;

	
	//Estrategia del enemigo
	private EnemigoStrategy estrategia; //Composición por agregación
	
	//Se deja por implementar para que cada enemmigo haga sus ataques o defensas
	public abstract String ataque();
	public abstract String defensa();
	
	/**
	 * Elegir siguiente movimiento final?
	 */
	public Movimiento siguienteMovimiento() {
		
		float random = (float)(Math.random());
		
		if(random<=this.estrategia.getProbabilidadAtaque()) {
			return Movimiento.ATACAR;
		}
		
		return Movimiento.DEFENDER;
		
	}

	//Getters y setters 
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getFuerza() {
		return fuerza;
	}

	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}

	public Integer getResistencia() {
		return resistencia;
	}

	public void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}

	public Integer getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(Integer agilidad) {
		this.agilidad = agilidad;
	}

	public EnemigoStrategy getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EnemigoStrategy estrategia) {
		this.estrategia = estrategia;
	}
	public Integer getVidas() {
		return vidas;
	}
	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	
	

	
	
}
