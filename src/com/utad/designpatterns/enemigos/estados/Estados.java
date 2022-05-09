package com.utad.designpatterns.enemigos.estados;

//Extesión de la interfaz LibraryLoanProcess
public interface Estados extends Procesar {
	public void cambiaEstadoAtaque();
	public void cambiaEstadoDefensa();
	public void cambiaEstadoMuerto();
}
