package dia5_POO_herencia;

public class Coche extends Vehiculo {
	int numeroPuertas;

	public Coche(String marca, String modelo, int año, int numeroPuertas) {
		super(marca,modelo,año);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", getNumeroPuertas()=" + getNumeroPuertas() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getAño()=" + getAño();
	}

	
	
	
	
	
	
}
