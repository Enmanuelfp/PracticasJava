package dia4_Array_Colecciones;

import java.util.Iterator;

public class SumaMatrices {
	/*
	 * SumaMatrices empezar = new SumaMatrices();
		empezar.sumar();
	 */
	public void sumar() {
		int [][] matriz1 = {{1,2,3},{4,5,6}};
		int [][] matriz2 = {{7,8,9},{10,11,12}};
		int [][] matriz3 = new int [2][3];
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3[i].length; j++) {
				System.out.println(matriz3[i][j]);
			}
			System.out.println("");
		}
	}
}
