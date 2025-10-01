package logica_basica;

import java.util.Scanner;

public class EstadisticasPalabras {
	public void contadorPalabras(String palabra) {
		
//		String palabra = "";
//		EstadisticasPalabras estadistica = new EstadisticasPalabras();
//		Scanner scanner = new Scanner(System.in);
//
//		do {
//			System.out.println("INTRODUCE TU PALABRA");
//			palabra = scanner.nextLine();
//		} while (palabra.isEmpty());
//
//		estadistica.contadorPalabras(palabra);
//		scanner.close();
		
		int numero_palabras = 0;
		String[] palabras = palabra.split(" ");
		String masLarga = "";
		String masCorta = palabras[0];
		Double promedio = 0.0;
		int numeros_letras = 0;
		
		
		for (int i = 0; i < palabras.length; i++) {
			
				
				
			if (palabras[i].length()>masLarga.length()) {
				masLarga= palabras[i];
			}
			if (palabras[i].length()<masCorta.length()) {
				masCorta= palabras[i];
			}
			numeros_letras += palabras[i].length();
		}
		numero_palabras = palabras.length;
		
		promedio = (double) numeros_letras/numero_palabras;
		
		System.out.println("Palabras: " + numero_palabras);
		System.out.println("Palabra mas larga: " + masLarga);
		System.out.println("Palabra mas corta  " + masCorta);
		System.out.println("Promedio: " + promedio);
		
	}
}
