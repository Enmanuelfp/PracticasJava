package logica_basica_dia1;

import dia5_POO_polimorfismo.Circulo;
import dia5_POO_polimorfismo.Figura;
import dia5_POO_polimorfismo.Rectangulo;
import dia5_POO_polimorfismo.Triangulo;

public class Main {

	public static void main(String[] args) {
		Figura[] figuras = { new Circulo("Rojo", 5.0), new Rectangulo("Azul", 4.0, 6.0),
				new Triangulo("Verde", 3.0, 4.0) };

		for (Figura figura : figuras) {
			System.out.println("Color: " + figura.getColor());
			System.out.println("Área: " + figura.calcularArea());
			System.out.println("Perímetro: " + figura.calcularPerimetro());
			System.out.println("---");
		}
	}
}
