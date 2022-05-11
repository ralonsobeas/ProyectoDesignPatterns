package com.utad.designpatterns.enemigos.estados;

/**
 * Clase para el Estado Activo
 * @author rodri
 *
 */
public class EstadoActivo implements Estados{
	
	private GestorEstados gestor;

	public void cambiaEstadoActivo() {
		throw new IllegalStateException("Ya está en estado activo");
	}
	public void cambiaEstadoParalizado() {
		this.gestor.setEstadoActual(gestor.getEstadoParalizado());
	}
	public void cambiaEstadoHerido() {
		this.gestor.setEstadoActual(gestor.getEstadoHerido());
	}
	public EstadoActivo() {
		super();
	}
	public EstadoActivo(GestorEstados gestor) {
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
		return "[" + this.gestor.getPokemon().getNombre() +  " está en estado Activo]";
	}

}
