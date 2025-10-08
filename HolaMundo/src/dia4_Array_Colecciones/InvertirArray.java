package dia4_Array_Colecciones;

public class InvertirArray {
	/*
	 * InvertirArray empezar = new InvertirArray();
		empezar.invertir();
	 */
	public void invertir() {
		int[]numeros = {1,2,3,4,5};
		
		
		for (int i = 0  ; i < numeros.length/2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = temp;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
