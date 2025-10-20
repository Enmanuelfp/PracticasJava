package dia5_POO_polimorfismo_sistemaDeEmpleados.copy;

public class Gerente extends Empleado {
	private double bono;

	public Gerente() {

	}

	public Gerente(String nombre, double salarioBase, double bono) {
		super(nombre,salarioBase);
		this.bono = bono;
	}
	
	

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public double calcularSalario() {
		return super.getSalarioBase() + this.bono;
	}

}
