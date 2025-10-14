package dia4_Array_Colecciones;

public class UnionArrays {
	int[] array1 = {1,2,3};
	int[] array2 = {4,5,6};
	int[] array3 = new int [array1.length+array2.length];
	/*
	 * 	UnionArrays empezar = new UnionArrays();
		empezar.union();
		empezar.imprimir();
	 */
	public void union() {
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length+i] = array2[i];
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}
}
