package logica_basica_dia1;

import java.util.Scanner;

public class NumeroPar {
	public boolean espar(int numero) {
		/*
		 * Scanner teclado = new Scanner(System.in);
		NumeroPar espar = new NumeroPar();
		boolean resultado = false;
		int numero = 0;
		
		System.out.println("Ingrese el numero y respondere si es par o impar");
		numero = teclado.nextInt();
		resultado = espar.espar(numero);
		if (resultado) {
			System.out.println("El numero es Par");
		}else {
			System.out.println("El numero es Impar");
		}
		 */
		boolean resultado = false;
		
		if (numero %2 == 0) {
			resultado =true;
		}
		
		return resultado;
	}
}
