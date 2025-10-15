package dia5_POO_herencia;

public class Moto extends Vehiculo {
	int cilindrada;
	
	public Moto(String marca, String modelo, int año, int cilindrada) {
		super(marca,modelo,año);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAño()=" + getAño() + "]";
	}

	
	
	
}
