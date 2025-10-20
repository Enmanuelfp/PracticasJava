package dia5_POO_polimorfismo_sistemaDeEmpleados.copy;

public class Desarrollador extends Empleado {

	private String lenguaje;

	public Desarrollador() {

	}
	
	public Desarrollador(String nombre, double salario,String lenguaje) {
		super(nombre,salario);
		this.lenguaje = lenguaje;
	}
	
	

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public double calcularSalario() {
		
		double extra = 0;
	    String lenguajeProgramacion = null;
		if ("Java".equalsIgnoreCase(lenguajeProgramacion)) {
	        extra = 500;
	    } else if ("Python".equalsIgnoreCase(lenguajeProgramacion)) {
	        extra = 400;
	    }
	    return salarioBase + extra;
	}

}
