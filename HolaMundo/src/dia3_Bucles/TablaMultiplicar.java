package dia3_Bucles;

public class TablaMultiplicar {
	/*
	 * TablaMultiplicar tabla = new TablaMultiplicar();
		tabla.tabla(7);
	 */
	public void tabla(int numero) {
		for (int i = 1; i <= 12; i++) {
			int n = numero * i;
			System.out.println(numero + "*" + i + "= " + n);
		}
	}
}
