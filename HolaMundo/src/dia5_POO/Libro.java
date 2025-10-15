package dia5_POO;
/*
 * public static void main(String[] args) {
    Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "123-456");
    
    libro1.mostrarInfo();
    libro1.prestar();      // Lo presta
    libro1.prestar();      // Dice que no está disponible
    libro1.devolver();     // Lo devuelve
    libro1.mostrarInfo();
}
 */
public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private boolean disponible;

	public Libro(String titulo, String autor, String isbn, boolean disponible) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponible = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void prestar() {
		if (this.disponible) {
			this.disponible = false;
			System.out.println("Libro '" + titulo + "' prestado correctamente");
		} else {
			System.out.println("El libro '" + titulo + "' no está disponible");
		}
	}

	public void devolver() {
		if (!this.disponible) {
			this.disponible = true;
			System.out.println("Libro '" + titulo + "' devuelto correctamente");
		} else {
			System.out.println("El libro '" + titulo + "' ya estaba disponible");
		}

	}

	public boolean estaDisponible() {
		return this.disponible;
	}

	public void mostrarInfo() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("ISBN: " + isbn);
		System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
	}
}
