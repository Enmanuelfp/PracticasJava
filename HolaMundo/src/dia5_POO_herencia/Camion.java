package dia5_POO_herencia;

public class Camion extends Vehiculo{
	int capacidadCarga;
	public Camion(String marca, String modelo, int año,int capacidadCarga) {
		super(marca,modelo,año);
		this.capacidadCarga = capacidadCarga;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	@Override
	public String toString() {
		return "Camion [capacidadCarga=" + capacidadCarga + ", getCapacidadCarga()=" + getCapacidadCarga()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAño()=" + getAño() + "]";
	}
	
	
	
}
