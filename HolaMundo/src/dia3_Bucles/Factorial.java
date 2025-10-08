package dia3_Bucles;

public class Factorial {
	/*
	 * Factorial calculadora = new Factorial();
		calculadora.calculadorFactorial(5);
	 */
	public void calculadorFactorial(int n) {
		int i = 1;
		int factorial = 1;
		while(i<=n) {
			factorial *=i;
			i++;
			
		}
		System.out.println(factorial);
	}
}
