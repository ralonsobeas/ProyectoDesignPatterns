package com.utad.designpatterns.enemigos.estados;

/**
 * Interfaz para los diferentes estados
 * @author rodri
 *
 */
public interface Estados extends Procesar {
	public void cambiaEstadoActivo();
	public void cambiaEstadoParalizado();
	public void cambiaEstadoHerido();
	
}
