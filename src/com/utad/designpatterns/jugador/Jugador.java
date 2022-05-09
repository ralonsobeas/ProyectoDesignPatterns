 package com.utad.designpatterns.jugador;
import com.utad.designpatterns.enemigos.*;

/**
 * Clase Jugador
@ -6,5 +7,31 @@ package com.utad.designpatterns.jugador;
 *
 */
public class Jugador {

	private String name;
	private Pokemon pokemon;
	
	
	public Jugador(String name) {
		this.name = name;
	}
	
	public Jugador() {
		super();
	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
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
}