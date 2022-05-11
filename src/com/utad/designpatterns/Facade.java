package com.utad.designpatterns;
import com.utad.designpatterns.contoladores.*;

/**
 * Clase para el patrón facade gestiona la acción de jugar
 * @author rodri
 *
 */
public class Facade implements FacadeInterfaz{
	private GameController controler = GameController.getInstance();
	
	/**
	 * Jugar al juego
	 */
	@Override
	public void play() {
		boolean controlador = false;
		
		System.out.println("Bienvenido al mundo pokemon entrenador.");
		System.out.println("Empecemos creando su personaje, cómo se llama: ");
		
		 controler.create_personaje();
		 
		System.out.println("Tu aventura comienza aquí, enfrentate a todos y sé el vencedor");
		controlador = controler.avanceNivel();
		 
		if( controlador == true) { //Comprobador del primer Nivel
			 
			 controlador = false;
			 controler.changeWorld();
			 System.out.println("Empieza la segunda fase.... SUERTE");
			 controlador = controler.avanceNivel();
			 
			 if(controlador == true) {//Comprobador del segundo Nivel
				 
				 controlador = false;
				 controler.changeWorld();
				 
				 System.out.println("Estás casi al final, ahora viene el ALTO MANDO");
				 controlador = controler.avanceNivel();
				 				 
				 if(controlador == true) {//Comprobador del tercer Nivel
					 controler.cerrarScanner();
					 System.out.println("Impresionante, has conseguido pasarte la liga Pokemon");
					 System.out.println("Has logrado el mayor logro en el mundo pokemon, hasta siempre entrenador");
				 }else {
					 controler.cerrarScanner();
					 System.out.println("Te has quedado a las puertas del éxito, sigue trabajando y lo conseguirás");
				 }
			 }else {
				 controler.cerrarScanner();
				 System.out.println("Casi logras llegar a la liga pokemon, vuelve a intentarlo más adelante");
			 }				 
		}else {
			 controler.cerrarScanner();
			 System.out.println("Tu aventura en este mundo ha terminado pero no dudes en volver a intentarlo");
		}
	}
}