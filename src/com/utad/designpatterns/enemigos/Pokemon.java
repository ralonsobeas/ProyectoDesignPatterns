package com.utad.designpatterns.enemigos;

import com.utad.designpatterns.enemigos.estrategias.DefensivoStrategy;
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
	private float fuerza;
	private float resistencia;
	private float agilidad;
	private float vidas;
	private Nivel nivel;

	public Pokemon(String nombre, Integer fuerza, Integer resistencia, Integer agilidad, Integer vidas, Nivel nivel) {
		this.setNombre(nombre);
		this.setFuerza(fuerza  * nivel.getMultiplicador()* this.getEstrategia().getFuerza());
		this.setResistencia(resistencia  * nivel.getMultiplicador());
		this.setAgilidad(agilidad  * nivel.getMultiplicador() * this.getEstrategia().getAgilidad() );
		this.setVidas(vidas  * nivel.getMultiplicador());
		this.setNivel(nivel);
	}

	
	//Estrategia del enemigo
	private EnemigoStrategy estrategia = new DefensivoStrategy();; //Composición por agregación
	
	//Se deja por implementar para que cada enemmigo haga sus ataques o defensas
	public abstract float ataque();
	public abstract float defensa();
	
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
	public float getFuerza() {
		return fuerza;
	}

	public void setFuerza(float fuerza) {
		this.fuerza = fuerza;
	}

	public float getResistencia() {
		return resistencia;
	}

	public void setResistencia(float resistencia) {
		this.resistencia = resistencia;
	}

	public float getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(float agilidad) {
		this.agilidad = agilidad;
	}

	public EnemigoStrategy getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(EnemigoStrategy estrategia) {
		this.estrategia = estrategia;
	}
	public float getVidas() {
		return vidas;
	}
	public void setVidas(float vidas) {
		this.vidas = vidas;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	
	

	
	
}
