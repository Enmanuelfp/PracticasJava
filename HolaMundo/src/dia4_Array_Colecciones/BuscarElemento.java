package dia4_Array_Colecciones;

public class BuscarElemento {
	/*
	 * BuscarElemento empezar = new BuscarElemento();
		empezar.busqueda(7);
	 */
	public void busqueda(int n) {
		int[]numeros = {4,2,7,1,9};
		boolean encontrado = false;
		int i = 0;
		for ( i = 0; i < numeros.length; i++) {
			if (numeros[i] == n) {
				encontrado = true;
				break;
			}
		}
		System.out.println("El numero: " + n + " fue encontrado en la posicion: " + i);
	}
}
