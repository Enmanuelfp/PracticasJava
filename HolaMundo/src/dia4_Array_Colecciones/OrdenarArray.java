package dia4_Array_Colecciones;

import java.util.Iterator;

public class OrdenarArray {
	/*
	 * OrdenarArray ordenar = new OrdenarArray();
        ordenar.ordenamiento();
	 */
	public void ordenamiento() {
		int[] entrada = {64,34,25,12,22,11,90};
		
		
		for (int i = 0; i < entrada.length-1; i++) {
			for (int j = 0; j < entrada.length-i-1; j++) {
				if (entrada[j]>entrada[j+1]) {
					int temp = entrada[j];
					entrada[j] = entrada[j + 1];
					entrada[j + 1] = temp;
				}
			}
		}
		System.out.println("Array ordenado:");
        imprimirArray(entrada);
        
		
	}
	private void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
