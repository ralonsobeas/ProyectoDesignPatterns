package com.utad.designpatterns.enemigos.estados;

public class EstadoMuerto implements Estados{
	
	private GestorEstados gestor;

	public void cambiaEstadoAtaque() {
		throw new IllegalStateException("Este pokemon está muerto, no puede pasar a estado Ataque");
	}
	public void cambiaEstadoDefensa() {
		throw new IllegalStateException("Este pokemon está muerto, no puede pasar a estado Defensa");
	}
	public void cambiaEstadoMuerto() {
		throw new IllegalStateException("Ya está en estado muerto");
	}
	public EstadoMuerto() {
		super();
	}
	public EstadoMuerto(GestorEstados gestor) {
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
		return "[" + this.gestor.getPokemon().getNombre() +  " está en estado Muerto]";
	}
}
