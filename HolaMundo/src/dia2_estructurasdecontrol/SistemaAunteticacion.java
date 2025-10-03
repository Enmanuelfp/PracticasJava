
package dia2_estructurasdecontrol;

import java.util.Scanner;

public class SistemaAunteticacion {
	
	/*
	 * Scanner teclado = new Scanner(System.in);
		SistemaAunteticacion sistema = new SistemaAunteticacion();
		String usuario = "";
		String contraseña = "";
		boolean aprobado = false;
		System.out.println("Ingrese su usuario");
		usuario = teclado.nextLine();
		System.out.println("Ingrese su contraseña");
		contraseña = teclado.nextLine();
		aprobado = sistema.esUsuario(usuario, contraseña);
		if (aprobado) {
			System.out.println("Bienvenido");
		}else {
			System.out.println("Usuario o contraseña invalida");
		}
	 */
	
	
	public boolean esUsuario(String usuario, String contraseña) {
		boolean admitido = false;
		String user = "Admin";
		String pass = "123";
		if (usuario.matches(user) && contraseña.matches(pass)) {
			admitido = true;
		}
		
		return admitido;
	}
}
