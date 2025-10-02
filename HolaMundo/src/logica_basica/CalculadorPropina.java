package logica_basica;

import java.util.Scanner;

public class CalculadorPropina {
	public double calculadoraPropina(double cuenta) {
		
		/*
		 * Scanner teclado = new Scanner(System.in);
		CalculadorPropina calculadora = new CalculadorPropina();
		double totalCuenta = 0.0;
		double cuenta = 0.0;
		double propina = 0.0;
		System.out.println("Ingrese la cuenta:");
		cuenta = teclado.nextDouble();
		propina = calculadora.calculadoraPropina(cuenta);
		totalCuenta = cuenta + propina;
		System.out.println("Cuenta: " + cuenta);
		System.out.println("Propina: " + propina);
		System.out.println("Total: " + totalCuenta);
		 */
		double propina = cuenta * 10/100;
		
		
		return propina;
	}
}
