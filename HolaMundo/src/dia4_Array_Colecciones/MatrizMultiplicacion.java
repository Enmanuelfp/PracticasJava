package dia4_Array_Colecciones;

public class MatrizMultiplicacion {
	/*
	 * MatrizMultiplicacion empezar = new MatrizMultiplicacion();
		empezar.matriz();
	 */
	public void matriz() {
		int[][] matriz = new int [5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]= i*j;
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
