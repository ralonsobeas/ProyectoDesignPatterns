package com.utad.designpatterns.jugador;
import com.utad.designpatterns.enemigos.*;
import com.utad.designpatterns.decorator.*;
import com.utad.designpatterns.decorator.Movimiento;


/**
 * Clase Jugador
 *
 */
public class Jugador {

	private String name;
	private Pokemon pokemon;
	private AccionDecorator accionDecorator;
	private AccionBaseDecorator ataqueFuerte = new AtaqueFuerte(accionDecorator);
	private AccionBaseDecorator ataqueBase = new AtaqueBase(accionDecorator);
	private AccionBaseDecorator defensaBase= new DefensaBase(accionDecorator);
	
	
	public Jugador(String name) {
		this.name = name;
	}
	
	public Jugador() {
		super();
	}
	
	/**
	 * Setter pokemon jugador
	 * @param pokemon
	 */
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		 this.accionDecorator = new Movimiento(pokemon);
		 this.ataqueFuerte = new AtaqueFuerte(accionDecorator);
		 this.ataqueBase = new AtaqueBase(accionDecorator);
		 this.defensaBase= new DefensaBase(accionDecorator);
		 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	public AccionDecorator getAccionDecorator() {
		return accionDecorator;
	}

	public void setAccionDecorator(AccionDecorator accionDecorator) {
		this.accionDecorator = accionDecorator;
	}
	
	public float ataqueFuerte() {
		return this.ataqueFuerte.getDanio();
	}
	
	public float ataqueBase() {
		return this.ataqueBase.getDanio();
	}
	
	public float defensaBase() {
		return this.defensaBase.getDanio();
	}
}