package dia2_estructurasdecontrol;

import java.util.Scanner;

public class CalculadoraSwitch {
	public double calculadora(double numero1, double numero2, String signo) {
		/*
		 * Scanner teclado = new Scanner(System.in);
		CalculadoraSwitch calculadora = new CalculadoraSwitch();
		double numero1 = 0.0;
		double numero2 = 0.0;
		double resultado = 0.0;
		String signo;
		System.out.println("Bienvenido");
		System.out.println("Seleccione la operacion que desea hacer");
		System.out.println("desea sumar(+)");
		System.out.println("desea sumar(-)");
		System.out.println("desea sumar(*)");
		System.out.println("desea sumar(/)");
		signo = teclado.nextLine();
		System.out.println("Por favor ingrese el primero numero");
		numero1 = teclado.nextDouble();
		System.out.println("Por favor ingrese el segundo numero");
		numero2 = teclado.nextDouble();
		resultado = calculadora.calculadora(numero1, numero2, signo);
		System.out.println("El resultado es: " + resultado);
		 */
		double resultado = 0.0;
		switch (signo) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			resultado = numero1-numero2;
			break;
		case "*":
			resultado = numero1*numero2;
			break;
		case "/":
			resultado = numero1/numero2;
			break;
		}
		
		return resultado;
	}
}
