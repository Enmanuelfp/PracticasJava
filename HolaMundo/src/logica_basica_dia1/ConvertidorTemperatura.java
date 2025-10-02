package logica_basica_dia1;

public class ConvertidorTemperatura {
	public double calculadoraTemperatura(double celsius) {
		
		/*
		 * Scanner teclado = new Scanner(System.in);
		ConvertidorTemperatura calculadora = new ConvertidorTemperatura();
		
		double celsius = 0.0;
		System.out.println("Ingrese los grados celsius a calcular");
		celsius = teclado.nextDouble();
		
		double resultado = calculadora.calculadoraTemperatura(celsius);
		System.out.println("Celsius: " + celsius + " Fahrenheit: " + resultado);
		 */
		double fahrenheit = 0.0;
		fahrenheit = (celsius*9/5)+32;
		
		
		return fahrenheit;
	}
}
