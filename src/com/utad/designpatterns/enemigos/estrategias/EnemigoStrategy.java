package com.utad.designpatterns.enemigos.estrategias;

public interface EnemigoStrategy {
	
	//Probabilidad de ataque si es pasivo (menos probabilidad) o agresivo (más)
	public float getProbabilidadAtaque();
	//Si es agresivo tiene más fuerza
	public float getFuerza();
	//Si es agresivo tiene más agilidad
	public float getAgilidad();
	

}
