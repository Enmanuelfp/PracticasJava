package dia4_Array_Colecciones;

public class EncontrarMaximoMinimo {
	/*
	 * EncontrarMaximoMinimo empezar = new EncontrarMaximoMinimo();
		empezar.busqueda();
	 */
	public void busqueda() {
		int []numeros = {3,7,2,9,1,5};
		int mayor = 0;
		int menor = 0;
	
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>mayor) {
				mayor = numeros[i];
				menor = mayor;
			}else if(numeros[i]<menor) {
				menor = numeros[i];
			}
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
	}
}
