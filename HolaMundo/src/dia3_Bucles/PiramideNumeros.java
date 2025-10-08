package dia3_Bucles;

import java.util.Iterator;

public class PiramideNumeros {
	/*
	 * PiramideNumeros empezar = new PiramideNumeros();
		empezar.pinoNumeros();
	 */
	public void pinoNumeros() {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j <= i-1; j++) {
				System.out.print(i);
			}
			System.out.println("");
			
		}
	}
}
