package dia4_Array_Colecciones;

public class SumaElementos {
	/*
	 * SumaElementos empezar = new SumaElementos();
		empezar.suma();
	 */
	public void suma() {
		int[] numeros = {25,25,25,25,25};
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			 suma += numeros[i];
		}
		System.out.println(suma);
	}
}
