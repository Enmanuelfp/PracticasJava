package dia3_Bucles;

public class SecuenciaFibonacci {
	/*
	 * SecuenciaFibonacci secuencia = new SecuenciaFibonacci();
		secuencia.fibo(10);
	 */
	public void fibo(int numero) {
		int i=0;
		int a = 0;
		int b = 1;
		int siguiente=0;
		while(i<=numero) {
			siguiente= a + b;
			a = b;
			b = siguiente;
			i++;
			System.out.println(siguiente);
		}
	}
}
