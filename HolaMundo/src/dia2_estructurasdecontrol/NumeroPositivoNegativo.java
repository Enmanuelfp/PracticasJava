package dia2_estructurasdecontrol;

public class NumeroPositivoNegativo {
	public String evaluador(int numero) {
		/*
		 * Scanner teclado = new Scanner(System.in);
		NumeroPositivoNegativo evaluador = new NumeroPositivoNegativo();
		System.out.println("Ingrese el numero a evaluar");
		int numero = teclado.nextInt();
		String resultado = evaluador.evaluador(numero);
		System.out.println("EL numero: " + resultado);
		 */
		String resultado="Es negativo";
		
		if (numero>=0) {
			resultado="Es positivo";
		}
		
		return resultado;
	}
}
