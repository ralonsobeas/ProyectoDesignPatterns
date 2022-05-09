package com.utad.designpatterns.enemigos.estados;

public class EstadoDefensa implements Estados{
	
	private GestorEstados gestor;

	public void cambiaEstadoAtaque() {
		this.gestor.getPokemon().setAgilidad(this.gestor.getPokemon().getAgilidad()-3);
		this.gestor.getPokemon().setResistencia(this.gestor.getPokemon().getResistencia()+5);
		this.gestor.getPokemon().setFuerza(this.gestor.getPokemon().getFuerza()-2);
		
		this.gestor.setEstadoActual(gestor.getEstadoDefensa());
	}
	public void cambiaEstadoDefensa() {
		throw new IllegalStateException("Ya está en estado de defensa");
	}
	public void cambiaEstadoMuerto() {
		this.gestor.getPokemon().setAgilidad(0);
		this.gestor.getPokemon().setResistencia(0);
		this.gestor.getPokemon().setFuerza(0);
		
		this.gestor.setEstadoActual(gestor.getEstadoMuerto());
	}
	public EstadoDefensa() {
		super();
	}
	public EstadoDefensa(GestorEstados gestor) {
		super();
		this.gestor = gestor;
	}
	public void process(Estado estado) {

		if(estado.equals(Estado.ATAQUE))
			this.cambiaEstadoAtaque();
		else if(estado.equals(Estado.DEFENSA))
			this.cambiaEstadoDefensa();
		else if(estado.equals(Estado.MUERTO))
			this.cambiaEstadoMuerto();
	}
	@Override
	public String toString() {
		return "[" + this.gestor.getPokemon().getNombre() +  " está en estado Defensa]";
	}
}
