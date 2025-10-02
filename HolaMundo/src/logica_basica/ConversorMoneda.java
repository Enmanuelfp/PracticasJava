package logica_basica;

import java.util.Scanner;

public class ConversorMoneda {
	public double  conversor(double numero) {
		/*
		 * 	Scanner teclado = new Scanner(System.in);
		ConversorMoneda conversor = new ConversorMoneda();
		double euros = 0.0;
		double dolares = 0.0;
		System.out.println("Ingrese la cantidad de euros a convertir");
		euros= teclado.nextDouble();
		dolares = conversor.conversor(euros);
		System.out.println("Euros: " + euros);
		System.out.println("Dolares: " + dolares);
		 */
		double resultado = 0.0;
		double tasadecambio = 1.08; //1 euro = 1.08 dolares
		resultado = tasadecambio*numero;
												
		return resultado;
	}
}
