package dia5_POO;
/*
 * Circulo c1 = new Circulo(5);
	    System.out.println("Área: " + c1.calcularArea());
	    System.out.println("Perímetro: " + c1.calcularPerimetro());
	    
	    Circulo c2 = new Circulo(-3);  // Se convierte en 0
	    System.out.println("Área: " + c2.calcularArea());  // 0
 */
public class Circulo {
	private double radio;

	public Circulo(double radio) {
		if (radio < 0) {
			this.radio = 0;
		} else {
			this.radio = radio;
		}

	}

	public Circulo() {
		this.radio = 0;
	}

	public double calcularArea() {
		return Math.PI * (this.radio * this.radio);

	}

	public double calcularPerimetro() {
		return 2 * Math.PI * this.radio;

	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if (radio >= 0) {
			this.radio = radio;
		}
	}

}
