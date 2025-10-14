package dia4_Array_Colecciones;

public class FrecuenciadeElementos {
	/*
	 * FrecuenciadeElementos empezar = new FrecuenciadeElementos();
		empezar.busqueda();
		empezar.imprimir();
	 */
	int[] matriz = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
	int[][] resultado = new int[matriz.length][2];
	int cantidadUnicos = 0;

	  public void busqueda() {
	        for (int i = 0; i < matriz.length; i++) {
	            int numeroActual = matriz[i];
	            boolean yaExiste = false;
	           
	            for (int j = 0; j < cantidadUnicos; j++) {
	                if (resultado[j][0] == numeroActual) {
	                    resultado[j][1]++;
	                    yaExiste = true;
	                    break;
	                }
	            }
	            
	            if (!yaExiste) {
	                resultado[cantidadUnicos][0] = numeroActual;  
	                resultado[cantidadUnicos][1] = 1;             
	                cantidadUnicos++;
	            }
	        }
	    }

	  public void imprimir() {
	        for (int i = 0; i < cantidadUnicos; i++) {
	            System.out.println(resultado[i][0] + ": " + resultado[i][1] + " vez/veces");
	        }
	    }
}
