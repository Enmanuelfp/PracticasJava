package dia4_Array_Colecciones;

public class ContarParesImpares {
	/*
	 * ContarParesImpares empezar = new ContarParesImpares();
		empezar.contar();
	 */
	public void contar() {
		int[]numeros = {2,5,8,3,6,7};
		int impares= 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 != 0) {
				impares++;
			}
		}
		System.out.println("Impares encontrados " + impares);
	}
}
