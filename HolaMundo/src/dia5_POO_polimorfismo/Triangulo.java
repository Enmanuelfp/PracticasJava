package dia5_POO_polimorfismo;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	 public Triangulo(String color, double base, double altura) {
	        super(color);
	        this.base = base;
	        this.altura = altura;
	    }
	
	 
	
	  public Triangulo() {
	        super("Negro"); 
	    }

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area = (base*altura)/2;
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
	}

}
