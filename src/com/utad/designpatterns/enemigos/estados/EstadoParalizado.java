package com.utad.designpatterns.enemigos.estados;

/**
 * Clase para el Estado Paralizado
 * @author rodri
 *
 */
public class EstadoParalizado implements Estados{
	
	private GestorEstados gestor;

	public void cambiaEstadoActivo() {
		this.gestor.setEstadoActual(gestor.getEstadoActivo());
	}
	public void cambiaEstadoParalizado() {
		throw new IllegalStateException("Ya está en estado paralizado");
	}
	public void cambiaEstadoHerido() {
		this.gestor.setEstadoActual(gestor.getEstadoHerido());
	}
	public EstadoParalizado() {
		super();
	}
	public EstadoParalizado(GestorEstados gestor) {
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
		return "[" + this.gestor.getPokemon().getNombre() +  " está en estado Paralizado]";
	}
}
