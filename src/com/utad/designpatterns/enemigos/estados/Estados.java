package com.utad.designpatterns.enemigos.estados;

//Extesi�n de la interfaz LibraryLoanProcess
public interface Estados extends Procesar {
	public void cambiaEstadoAtaque();
	public void cambiaEstadoDefensa();
	public void cambiaEstadoMuerto();
}
