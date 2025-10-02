package dia2_estructurasdecontrol;

import java.util.Scanner;

public class ClasificadorNotas {
	public String calculadoraNotas(double numero) {
		/*
		 * Scanner teclado = new Scanner(System.in);
		ClasificadorNotas calculadora = new ClasificadorNotas();
		System.out.println("INGRESE LA NOTA");
		double nota = teclado.nextDouble();
		String resultado = calculadora.calculadoraNotas(nota);
		System.out.println("Calificacion: "+ resultado ); 
		 */
		String resultado="";
		if (numero <= 4) {
			resultado = "Suspenso";
		}else if(numero >=5 && numero <=6) {
			resultado = "Aprobado";
		}else if(numero >=7 && numero <=8) {
			resultado = "Notable";
		}else if(numero >=9 && numero <=10) {
			resultado = "Excelente";
		}
		return resultado;
	}
}
