package logica_basica;

public class IntercambioValoresVariables {
	/*
	 * IntercambioValoresVariables intercambio = new IntercambioValoresVariables();
	 * intercambio.intercambio();
	 */
	
	
	public void intercambio() {
		int a = 5;
		int b = 10;
		System.out.println("ANTES: a = " + a + ", b = " + b);
		 a = a + b; // a ahora es 15
	     b = a - b; // b ahora es 5
	     a = a - b; // a ahora es 10
		System.out.println("Despues: a = " + a + ", b = " + b);
		
	}
}
