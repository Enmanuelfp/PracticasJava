package dia4_Array_Colecciones;

import java.util.ArrayList;

public class ArrayListNombres {
	/*
	 * ArrayListNombres empezar = new ArrayListNombres();
		empezar.añadir("Enmanuel");
		empezar.buscar("Enmanuel");
		empezar.eliminar("Enmanuel");
		empezar.mostrar();
	 */
	ArrayList<String> nombres = new ArrayList<>();
	
	public void añadir(String valor) {
		nombres.add(valor);
	}
	public void buscar(String valor) {
		if (nombres.contains(valor)) {
			System.out.println(valor+ " Encontrado");
		}
	}
	public void eliminar(String valor) {
		 if (nombres.remove(valor)) {
		        System.out.println(valor + " eliminado");
		    } else {
		        System.out.println(valor + " no encontrado");
		    }
	}
	public void mostrar() {
		System.out.println(nombres);
	}
	
}
