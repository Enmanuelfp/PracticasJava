package logica_basica_dia1;

import java.util.Iterator;
import java.util.Scanner;

public class NumeroPrimo {
	public void numerosPrimo() {
		int numeroIngresado;
		boolean esprimo = true;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Por favor ingresa un numero y valorare si es primo no");
			System.out.println("nota: tiene que ser mayor o igual a 1 sino te voy a bloquear la entrada campeon");
			numeroIngresado = scanner.nextInt();
			
		} while(numeroIngresado < 1);
		
		
		if(numeroIngresado == 1) {
			esprimo = false;
		}else {
			for(int i = 2; i <= Math.sqrt(numeroIngresado); i++) {
				if(numeroIngresado % i == 0) {
					esprimo= false;
					break;
				}
			}
		}
		if (esprimo) {
			System.out.println("El numero : " + numeroIngresado + " Es primo");
		}else {
			System.out.println("El numero : " + numeroIngresado + " No es primo");
		}
		scanner.close();
		
	}
	
	
	
	
}
