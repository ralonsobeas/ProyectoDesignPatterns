package com.utad.designpatterns.enemigos.estados;

import com.utad.designpatterns.enemigos.PokemonInterfaz;

/**
 * Gestor de los diferentes estados
 * @author rodri
 *
 */
public class GestorEstados implements Procesar{

	private Procesar estadoActual;  //Variable en la que puede estar cualquier 
	//estado para indicar en cual se encuentra la petición

//Variables en las que introducimos los distintos estados 
//para no tener que reservar memoria cada vez que hagamos una transición
	
	private Estados estadoActivo;
	private Estados estadoParalizado;
	private Estados estadoHerido;
	
	private PokemonInterfaz pokemon;
	
	/**
	 * Procesar estado
	 */
	public void process(Estado estado){
		this.estadoActual.process(estado); //Delegación por composición fuerte
	}
	
	/**
	 * Constructor del gestor
	 * @param pokemon
	 */
	public GestorEstados(PokemonInterfaz pokemon) {
		this.estadoActivo = new EstadoActivo(this);
		this.estadoParalizado = new EstadoParalizado(this);
		this.estadoHerido = new EstadoHerido(this);
		this.estadoActual = this.estadoActivo;
	
		
		this.pokemon = pokemon;
	}
	
	//Getters y Setters
	
	public void setEstadoActual(Procesar estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	public Procesar getEstadoActual() {
		return estadoActual;
	}
	
	public Estados getEstadoActivo() {
		return estadoActivo;
	}
	
	public Estados getEstadoParalizado() {
		return estadoParalizado;
	}
	
	public Estados getEstadoHerido() {
		return estadoHerido;
	}
	
	public PokemonInterfaz getPokemon() {
		return this.pokemon;
	}

}