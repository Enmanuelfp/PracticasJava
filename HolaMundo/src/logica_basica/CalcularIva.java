package logica_basica;

public class CalcularIva {
	public double calcularIva(int numero) {
		/*
		 * Scanner teclado = new Scanner(System.in);
		CalcularIva calculadora = new CalcularIva();
		double iva = 0.0;
		int numero = 0;
		System.out.println("Ingrese el monto a calcular el iva");
		numero = teclado.nextInt();
		iva = calculadora.calcularIva(numero);
		System.out.println("El 20 % de iva de : " + numero + " Es :" + iva) ;
		 */
		double resultado = 0.0;
		
		resultado = numero*21/100;
		
		return resultado;
	}
}
