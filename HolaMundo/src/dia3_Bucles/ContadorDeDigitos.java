package dia3_Bucles;

import java.util.Scanner;

public class ContadorDeDigitos {
	/*
	 * Scanner teclado = new Scanner(System.in);
		ContadorDeDigitos empezar = new ContadorDeDigitos();
		System.out.println("Ingrese un numero");
		String numero = teclado.next();
		
		int resultado = empezar.contador(numero);
		System.out.println("El numero: " + numero + " Tiene " + resultado + " Digitos" );
	 */
	public int contador (String n) {
		int digitos = 0;
		int i = 0;
		while(i < n.length()) {
			digitos++;
			i++;
		}
		
		return digitos;
	}
}
