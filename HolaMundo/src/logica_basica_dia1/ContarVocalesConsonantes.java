package logica_basica_dia1;

public class ContarVocalesConsonantes {
	//COLOCAR ESTO EN MAIN AUNQUE ESO DEBERIAS SABERLO CRACK
//	ContarVocalesConsonantes contador = new ContarVocalesConsonantes();
//	Scanner scanner = new Scanner(System.in);
//	String palabra = "";
//	String resultado = "";
//	
//	do {
//	    System.out.println("Ingrese una palabra (solo letras y espacios):");
//	    palabra = scanner.nextLine();
//	} while(palabra.trim().isEmpty() || !palabra.matches("[a-zA-ZáéíóúüñÑÁÉÍÓÚÜ\\s]+"));
//	
//	resultado = contador.contadorDeVocalesConsonantes(palabra);
//	System.out.println(resultado);
	
	
	public String contadorDeVocalesConsonantes(String palabra) {
		int vocalesContadas= 0;
		int consonantesContadas= 0;
		String vocales = "aeiouáéíóúü";
		
		palabra = palabra.toLowerCase();
		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);
			if(vocales.indexOf(letra) != -1) {
				vocalesContadas++;
			}else if(Character.isLetter(letra)) {
				consonantesContadas++;
				
			}
		}
		String resultado = "Vocales = " + vocalesContadas + " Consonantes = " + consonantesContadas;
		return resultado;
	}
}
