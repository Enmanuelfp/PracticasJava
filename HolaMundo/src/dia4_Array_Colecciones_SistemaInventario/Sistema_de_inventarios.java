package dia4_Array_Colecciones_SistemaInventario;

import java.util.ArrayList;

public class Sistema_de_inventarios {
	ArrayList<Producto> productos = new ArrayList<Producto>();

	public void añadir(Producto producto) {
		productos.add(producto);
	}

	public void buscar(String nombre) {
		boolean encontrado = false;
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Articulo encontrado: " + producto.getNombre());
				System.out.println("Cantidad: " + producto.getCantidad());
				System.out.println("Precio: " + producto.getPrecio());
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el producto: " + nombre);
		}
	}

	public void actualizarCantidad(String nombre, int n) {
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				producto.setCantidad(n);
				System.out.println("Cantidad actualizada correctamente");
				return;
			}
		}
	}

	public void mostrarInventario() {
		for (Producto producto : productos) {
			System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: "
					+ producto.getCantidad());

		}
	}

	public void calcularValorTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio() * producto.getCantidad();
		}
		System.out.println("El valor total del inventario es: " + total);
	}

}
