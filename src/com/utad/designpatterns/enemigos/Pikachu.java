package com.utad.designpatterns.enemigos;

public class Pikachu extends Enemigo{

	public float ataque() {
		return this.getFuerza() * this.getEstrategia().getFuerza();
		
	}

}
