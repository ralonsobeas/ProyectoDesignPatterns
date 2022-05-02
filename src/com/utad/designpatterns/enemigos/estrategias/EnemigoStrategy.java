package com.utad.designpatterns.enemigos.estrategias;

public interface EnemigoStrategy {
	
	//Probabilidad de ataque si es pasivo (menos probabilidad) o agresivo (m�s)
	public float getProbabilidadAtaque();
	//Si es agresivo tiene m�s fuerza
	public float getFuerza();
	//Si es agresivo tiene m�s agilidad
	public float getAgilidad();
	

}
