package com.utad.designpatterns;
import com.utad.designpatterns.contoladores.*;

public class facade implements facade_Interfaz{
	private GameController controler = GameController.getInstance();
	
	@Override
	public void play() {
		System.out.println("Bienvenido al mundo pokemonn entrenador");
		System.out.println("Empecemos creando su personaje, como se llama: ");
		
		 controler.create_personaje();
		 
		//System.out.println("Tu avent")
		 controler.Combat();
	}
}