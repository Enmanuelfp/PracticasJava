package dia3_Bucles;

public class PatronAsteriscos {
	public void pino() {
		/*
		 * PatronAsteriscos arbol = new PatronAsteriscos();
		arbol.pino();
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
