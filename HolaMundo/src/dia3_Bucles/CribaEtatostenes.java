package dia3_Bucles;

public class CribaEtatostenes {
	/*
	 * CribaEtatostenes empezar = new CribaEtatostenes();
		empezar.criba();
	 */
	public void criba() {
		boolean esprimo= true;
		for (int i = 2; i < 100; i++) {
			esprimo= true;
			for (int j = 2; j*j <=i; j++) {
				if (i%j==0) {
					esprimo = false;
					break;
				}
			}
			if (esprimo) {
				System.out.println(i);
			}
		}
	}
	
}
