package dia3_Bucles;

import java.util.Iterator;

public class ConversorBinario {
	/*
	 * ConversorBinario conversor = new ConversorBinario();
		conversor.conversor(13);
	 */
	public void conversor(int n) {
		int cociente = 0;
		String residuo = "";
		int binario = 0;
		
		while (n>0) {
			cociente = n/2;
			residuo = n%2 + residuo;
			n = cociente;
		}
		for (int i = 0; i < residuo.length(); i++) {
			System.out.println(residuo.charAt(i));
		}
	}
}
