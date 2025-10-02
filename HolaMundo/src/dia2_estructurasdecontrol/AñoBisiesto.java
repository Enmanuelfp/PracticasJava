package dia2_estructurasdecontrol;

import java.util.Scanner;

public class AñoBisiesto {
	public boolean esbisiesto(int año) {
		/*
		 * int año = 0;
		boolean esbisiesto = false;
		
		Scanner teclado = new Scanner(System.in);
		AñoBisiesto calculadora = new AñoBisiesto();
		System.out.println("Introduzca un año a evaluar");
		año = teclado.nextInt();
		esbisiesto = calculadora.esbisiesto(año);
		if (esbisiesto) {
			System.out.println("El año: " + año + " Es bisiesto");
		}else {
			System.out.println("El año: " + año + " No es bisiesto");
		}
		teclado.close();
		 */
		boolean resultado = false;
		
		if(año % 4 == 0 && año %100 !=0 || año % 400 == 0) {
			resultado = true;
		}
		return resultado;
	}
}
