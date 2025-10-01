package logica_basica;

public class Palindromo {
	public Boolean espalindromo(String palabra) {
	//	Palindromo palindromo = new Palindromo();
//		Scanner scanner = new Scanner(System.in);
//		
//		String palabra;
//		Boolean espalindrome;
//		
//		do {
//			System.out.println("Por favor ingrese una palabra a evualar");
//			palabra = scanner.nextLine();
//		}while(palabra.trim().isEmpty());
//		espalindrome = palindromo.espalindromo(palabra);
//		if(espalindrome) {
//			System.out.println("la palabra es palindrome"); 
//		}else {
//			System.out.println("la palabra NO es palindrome"); 
//		}
//		scanner.close();
		
		Boolean resultado =false;
		String palabra2="";
		palabra = palabra.toLowerCase().replace(" ", "");
		char letra;
		for (int i = palabra.length()-1; i >= 0 ; i--) {
			letra = palabra.charAt(i);
			palabra2 += letra;
		}
		if (palabra.equals(palabra2)) {
			resultado = true;
		}
		
		return resultado;
	}
}
