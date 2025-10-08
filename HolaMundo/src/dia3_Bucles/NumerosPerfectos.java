package dia3_Bucles;

public class NumerosPerfectos {
	/*
	 * NumerosPerfectos empezar = new NumerosPerfectos();
		empezar.nperfecto();
	 */
	public int nperfecto() {
		int suma = 0;
		
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					suma += j;
				}
			}
			if (suma == i) {
				System.out.println(suma);
			}
			suma = 0;
		}

		return suma;
	}
}
