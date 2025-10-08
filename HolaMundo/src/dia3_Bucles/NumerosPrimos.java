package dia3_Bucles;

public class NumerosPrimos {
	public void secuencia(int numero) {
		/*
		 * NumerosPrimos numero = new NumerosPrimos();
		numero.secuencia(50);
		 */
		boolean esprimo = true;
		for (int j = 1; j <= numero; j++) {
			esprimo = true;
				for (int i = 2; i <= Math.sqrt(j); i++) {
					if(j % i == 0) {
						esprimo= false;
				}	
			}
				if (esprimo) {
					System.out.println(j);
				}
		}
	}
}
