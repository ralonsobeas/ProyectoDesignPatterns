package com.utad.designpatterns.enemigos.estados;

/**
 * Clase para el Estado Herido
 * @author rodri
 *
 */
public class EstadoHerido implements Estados{
	
	private GestorEstados gestor;

	public void cambiaEstadoActivo() {
		this.gestor.setEstadoActual(gestor.getEstadoActivo());
	}
	public void cambiaEstadoParalizado() {
		this.gestor.setEstadoActual(gestor.getEstadoParalizado());
	}
	public void cambiaEstadoHerido() {
		throw new IllegalStateException("Ya está en estado herido");
	}
	public EstadoHerido() {
		super();
	}
	public EstadoHerido(GestorEstados gestor) {
		super();
		this.gestor = gestor;
	}
	public void process(Estado estado) {
		
		if(estado.equals(Estado.ACTIVO))
			this.cambiaEstadoActivo();
		else if(estado.equals(Estado.PARALIZADO))
			this.cambiaEstadoParalizado();
		else if(estado.equals(Estado.HERIDO))
			this.cambiaEstadoHerido();
	}
	@Override
	public String toString() {
		return "[" /*+ this.gestor.getPokemon().getNombre()*/ +  " está en estado Herido]";
	}
}
