package dia4_Array_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class EstadisticasNotas {
	
	/*
	 * EstadisticasNotas empezar = new EstadisticasNotas();
		empezar.añadirNotas();
		empezar.notaMasAltaYBaja();
		empezar.promedio();
		empezar.aprobados();
	 */
	ArrayList<Double> notas = new ArrayList<>();

	public void añadirNotas() {
		notas.add(7.5);
		notas.add(4.0);
		notas.add(8.0);
		notas.add(3.5);
		notas.add(6.0);
		notas.add(9.5);
		notas.add(5.0);
	}

	public void promedio(/* ArrayList<Double> notas */) {
		double promedio = 0.0;
		double sumatotal = 0.0;
		for (int i = 0; i < notas.size(); i++) {
			sumatotal += notas.get(i);
		}
		promedio = sumatotal / notas.size();
		System.out.println("El promedio es: " + promedio);
	}

	public void notaMasAltaYBaja(/* ArrayList<Double> notas */) {
		double notamayor = notas.get(0);
		double notamenor = notas.get(0);
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > notamayor) {
				notamayor = notas.get(i);
				
			} else if (notas.get(i) < notamenor) {
				notamenor = notas.get(i);
			}
		}
		System.out.println("La nota mayor obtenida fue: " + notamayor);
		System.out.println("La nota menor obtenida fue: " + notamenor);
	}

	public void aprobados() {
		int aprobados = 0;
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) >= 5) {
				aprobados++;
			}
		}
		System.out.println("Aprobados: " + aprobados + " Estudiantes");
	}

}
