package dia4_Array_Colecciones;

public class Buscarenmatriz {
	/*
	 * Buscarenmatriz empezar = new Buscarenmatriz();
		empezar.busqueda();
	 */
	int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int buscado = 5;

	public void busqueda() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 5) {
					System.out.println("El número " + buscado + " encontrado en la posición: " + "i: " + i + " j: " + j);
					return;
				}
			}
		}
	}
}
