package dia4_Array_Colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class EliminarDuplicados {
	/*
	 * EliminarDuplicados empezar = new EliminarDuplicados();
		empezar.eliminar();
		empezar.mostrar();
	 */
	int[] entrada = { 1, 2, 2, 3, 4, 4, 5 };
	int[] salida;
	HashSet<Integer> unicos = new HashSet<>();

	public void eliminar() {

		for (int num : entrada) {
			unicos.add(num);
		}
		salida = new int[unicos.size()];
		int i = 0;
		for (int num : unicos) {
			salida[i++] = num;
		}

	}

	public void mostrar() {
		System.out.println("Entrada: " + Arrays.toString(entrada));
	    System.out.println("Salida:  " + Arrays.toString(salida));
	}

}
