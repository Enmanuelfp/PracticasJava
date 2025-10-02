package logica_basica_dia1;

import java.util.Scanner;

public class AreaCirculo {
	/*
	 * 	double radio = 0.0;
		Scanner teclado = new Scanner(System.in);
		AreaCirculo areacirculo = new AreaCirculo();
		System.out.println("Por favor ingrese el area radio del circulo para calcular el area");
		radio  = teclado.nextDouble();
		double resultado = areacirculo.areaCirculo(radio);
		System.out.println("El area del circulo es: " + resultado );
		teclado.close();
		
	 */
	
	public double areaCirculo(double radio) {
		double area = 0.0;
		double pi = 3.1416;
			area = pi*radio*radio;
		
		return area; 
	}
}
