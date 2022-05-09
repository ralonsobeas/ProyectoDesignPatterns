package com.utad.designpatterns.enemigos.estados;

import com.utad.designpatterns.enemigos.PokemonInterfaz;

public class GestorEstados implements Procesar{

		private Procesar estadoActual;  //Variable en la que puede estar cualquier 
										//estado para indicar en cual se encuentra la petición
		
		//Variables en las que introducimos los distintos estados 
		//para no tener que reservar memoria cada vez que hagamos una transición
		
		private Estados estadoAtaque;
		private Estados estadoDefensa;
		private Estados estadoMuerto;
		
		private PokemonInterfaz pokemon;
		
		public void process(Estado estado){
			this.estadoActual.process(estado); //Delegación por composición fuerte
		}
		
		public GestorEstados(PokemonInterfaz pokemon, Estado estadoBase) {
			this.estadoAtaque = new EstadoAtaque();
			this.estadoDefensa = new EstadoDefensa();
			this.estadoMuerto = new EstadoMuerto();
			
			if(estadoBase.equals(Estado.ATAQUE))
				this.estadoActual = this.estadoAtaque;
			else if(estadoBase.equals(Estado.DEFENSA))
				this.estadoActual = this.estadoDefensa;
			else if(estadoBase.equals(Estado.MUERTO))
				this.estadoActual = this.estadoMuerto;
			
			this.pokemon = pokemon;
		}
		
		//Getters y Setters

		public void setEstadoActual(Procesar estadoActual) {
			this.estadoActual = estadoActual;
		}

		public Procesar getEstadoActual() {
			return estadoActual;
		}

		public Estados getEstadoAtaque() {
			return estadoAtaque;
		}

		public Estados getEstadoDefensa() {
			return estadoDefensa;
		}

		public Estados getEstadoMuerto() {
			return estadoMuerto;
		}
		public PokemonInterfaz getPokemon() {
			return this.pokemon;
		}


}