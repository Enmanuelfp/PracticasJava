package dia5_POO_polimorfismo_figurageometrica;

public class Circulo extends Figura {

	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * radio * radio;
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

}
