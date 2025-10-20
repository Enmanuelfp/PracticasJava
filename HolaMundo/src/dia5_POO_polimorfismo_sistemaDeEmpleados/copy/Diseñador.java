package dia5_POO_polimorfismo_sistemaDeEmpleados.copy;

public class Diseñador extends Empleado {
	private String herramientaDiseño;

	public Diseñador() {

	}

	public Diseñador(String nombre, double salario, String herramientaDiseño) {
		super(nombre, salario);
		this.herramientaDiseño = herramientaDiseño;
	}
	
	

	public String getHerramientaDiseño() {
		return herramientaDiseño;
	}

	public void setHerramientaDiseño(String herramientaDiseño) {
		this.herramientaDiseño = herramientaDiseño;
	}

	@Override
	public double calcularSalario() {
		   double extra = 0;
		    if ("Photoshop".equalsIgnoreCase(herramientaDiseño)) {
		        extra = 300;
		    } else if ("Figma".equalsIgnoreCase(herramientaDiseño)) {
		        extra = 350;
		    }
		    return salarioBase + extra;
	}

}
