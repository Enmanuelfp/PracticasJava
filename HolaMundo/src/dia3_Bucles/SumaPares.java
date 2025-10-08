package dia3_Bucles;

public class SumaPares {
	/*
	 * SumaPares metodo = new SumaPares();
		metodo.suma_pares();
	 */
	public void suma_pares() {
		int sumaTotal= 0;
		for (int i = 0; i <= 50; i++) {
			if (i%2 ==0) {
				sumaTotal+= + i;
			}
		}
		System.out.println(sumaTotal);
	}
}
