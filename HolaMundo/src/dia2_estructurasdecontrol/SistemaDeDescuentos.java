package dia2_estructurasdecontrol;

import java.util.Scanner;

public class SistemaDeDescuentos {
	public void Sistema(double montoCompra, boolean esClienteFrecuente,boolean tieneCupon) {
		/*
		 * 	Scanner teclado = new Scanner(System.in);
		SistemaDeDescuentos sistema = new SistemaDeDescuentos();
		String respuesta1 = "";
		String respuesta2 = "";
		double montoCompra = 0.0;
		boolean esClienteFrecuente = false;
		boolean tieneCupon = false;
		
		System.out.println("Ingrese monto de la compra");
		montoCompra = teclado.nextDouble();
		System.out.println("Es cliente frecuente? S/N");
		respuesta1 = teclado.next();
		if (respuesta1.equalsIgnoreCase("s")) {
			esClienteFrecuente = true;
		}
		System.out.println("Tiene cupon de descuento? S/N");
		respuesta2 = teclado.next();
		if (respuesta2.equalsIgnoreCase("s") ) {
			tieneCupon = true;
		}
		sistema.Sistema(montoCompra, esClienteFrecuente, tieneCupon);
		teclado.close();
		 */
		double  descuento10 = 0.10;
		double  descuento5 = 0.05;
		double descuentoTotal = 0.0;
		double clienteFrecuente = 0.05;
		double cupon = 0.15;
		double totalApagar= 0.0;
		double descuentoAplicado = 0.0;
	
		if (montoCompra>=100 ) {
			descuentoTotal += descuento10;
		}else if (montoCompra >=50 ) {
			descuentoTotal += descuento5;
		}
		
		if (esClienteFrecuente ) {
			descuentoTotal += clienteFrecuente;
		}
		
		if (tieneCupon ) {
			descuentoTotal += cupon;
		}
	
		if (descuentoTotal>0.40) {
			descuentoTotal=0.40;		
		}
		descuentoAplicado = montoCompra *  descuentoTotal;
		totalApagar = montoCompra - descuentoAplicado;
		
		System.out.println("=== SISTEMA DE DESCUENTOS ===");
        System.out.println("Monto de compra: €" + String.format("%.2f", montoCompra));
        System.out.println("Descuento aplicado: " + (int)(descuentoTotal * 100) + "%");
        System.out.println("Descuento en euros: €" + String.format("%.2f", descuentoAplicado));
        System.out.println("Total a pagar: €" +  String.format("%.2f", totalApagar));
        System.out.println("Cliente frecuente: " + (esClienteFrecuente ? "Sí" : "No"));
        System.out.println("Cupón aplicado: " + (tieneCupon ? "Sí" : "No"));
        System.out.println("-----------------------------");
		
		
		
	}
}
