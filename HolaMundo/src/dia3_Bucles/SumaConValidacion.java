package dia3_Bucles;

import java.util.Scanner;

public class SumaConValidacion {
	/*
	 * SumaConValidacion empezar = new SumaConValidacion();
		empezar.suma();
	 */
	public void suma() {
		System.out.println("Ingresa un numero a sumar, si deseas salir ingresa el 0");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int sumaTotal = 0;
		
		
		while(n!=0) {
			sumaTotal +=  n;
			System.out.println("Ingresa otro numero");
			n = teclado.nextInt();
		}
		System.out.println("La suma total de todos los numeros es: " + sumaTotal);
	}
}
