package dia2_estructurasdecontrol;

import java.util.Scanner;

public class CalculadorDeViajes {
	
	/*
	 * Scanner teclado = new Scanner(System.in);
		CalculadorDeViajes calculadora = new CalculadorDeViajes();
		double distancia = 0;
		String vehiculo ="";
		String peaje = "";
		double costodeviaje =0;
		System.out.println("Ingrese la distancia del viaje");
		distancia = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Ingrese el tipo de vehiculo");
		vehiculo = teclado.nextLine();
		System.out.println("pago peaje? S/N");
		peaje = teclado.nextLine();
		costodeviaje = calculadora.calculadora(distancia, vehiculo, peaje);
		System.out.println("El costo de viaje es:" + costodeviaje);
	 */
	
	public double calculadora(double distancia, String tipoVehiculo,String peaje) {
		double resultado=0;
		boolean tienepeaje= false;
		double costoviaje = 0;
		double descuento = 0;
		
		
		
		if(distancia < 100) {
		    costoviaje = 0.50 * distancia;
		} else if (distancia <= 500) {  
		    costoviaje = 0.40 * distancia;
		} else {
		    costoviaje = 0.30 * distancia;
		}
		
		if (tipoVehiculo.equalsIgnoreCase("moto")) {
			descuento = costoviaje*0.10;
			costoviaje = costoviaje - descuento; 
		}
		if (tipoVehiculo.equalsIgnoreCase("camion")) {
			descuento = costoviaje*0.20;
			costoviaje = costoviaje + descuento; 
		}
		if (peaje.equalsIgnoreCase("s")) {
			tienepeaje = true;
			costoviaje += 50;
		}
		
		resultado = costoviaje;
			
		
		
		return resultado;
	}
}
