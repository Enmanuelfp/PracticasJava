package dia2_estructurasdecontrol;

import java.util.Scanner;

public class CalculadoraImc {
	
	/*
	 * 		Scanner teclado = new Scanner(System.in);
		CalculadoraImc  calculadora = new CalculadoraImc();
		double estatura = 0;
		double peso = 0;
		double imc=0;
		String resultado ="";
		
		System.out.println("Ingrese su estatura");
		estatura = teclado.nextDouble();
		System.out.println("Ingrese su peso");
		peso = teclado.nextDouble();
		imc = calculadora.imcCalculador(estatura, peso);
		resultado = calculadora.calculador(imc);
		System.out.println("Su IMC es: " + String.format("%.2f", imc));
		System.out.println("Su IMC es: " + resultado);
	 */
	
	
	
	public String calculador(double imc) {
		String resultado="";
		if (imc<18.5) {
			resultado = "Bajo peso";
		}
		if (imc>=18.5 && imc <=24.9) {
			resultado = "Normal";
		}
		if (imc>=25 && imc <=29.9) {
			resultado = "Sobrepeso";
		}
		if (imc>=30) {
			resultado = "Obeso";
		}
		
		return resultado;
	}
	
	public Double imcCalculador(double altura, double peso) {
		double  imc = peso/(altura*2);
		return imc;
	}
}	
