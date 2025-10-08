package dia3_Bucles;

import java.util.Random;
import java.util.Scanner;

public class Juego_adivinaelnumero {
	/*
	 * Juego_adivinaelnumero empieza = new Juego_adivinaelnumero();
		empieza.eselnumero();
	 */
	public void eselnumero() {
		
		Scanner teclado = new Scanner(System.in);
		
		int n2 = (int) (Math.random() * (100 - 1)) + 1;
		int intentos = 1;
		
		System.out.println("Ingresa un numero y prueba tu suerte");
		int n = teclado.nextInt();
		while (n != n2) {

			if (n < n2) {
				System.out.println("tu numero es mas bajo que el numero a descrubrir");
			} else {
				System.out.println("tu numero es mas alto que el numero a descrubrir");
			}
			intentos++;
			System.out.println("Prueba de nuevo");
			 n = teclado.nextInt();
		}
		System.out.println("ACERTASTE");
		System.out.println("En: " + intentos + " Intentos");


	}
}
