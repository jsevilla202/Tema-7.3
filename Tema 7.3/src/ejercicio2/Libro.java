package ejercicio2;

/**
 * Clase de las funciones relacionadas con la biblioteca
 * 
 * @author Jaime Sevilla
 *
 */
public class Libro {
	/**
	 * Nombre del libro
	 */
	private String titulo;
	/**
	 * Nombre del autor del libro
	 */
	private String autor;
	/**
	 * Numero de ejemplares disponibles
	 */
	private final int ejemplares;
	/**
	 * Numero de ejemplares prestados
	 */
	private int prestados;
	/**
	 * Genero del libro
	 */
	private Genero genero;

	/**
	 * Constructor por defecto
	 */
	public Libro() {
		super();
		this.ejemplares = 0;
	}

	/**
	 * Constructor de todos los parametros
	 * 
	 * @param titulo     Parametro que recibe el valor del titulo
	 * @param autor      Parametro que recibe el valor del autor
	 * @param ejemplares Parametro que recibe el valor de los ejemplares
	 * @param prestados  Parametro que recibe el valor de los prestados
	 * @param genero Parametro que recibe el valor del genero
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, Genero genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		this.genero = genero;
	}

	/**
	 * Comprueba si el prestamo es posible o no
	 * 
	 * @return Devuelve si se puede o no realizar el prestamo
	 */
	boolean prestamo() {
		boolean prestamo = false;
		if (prestados < ejemplares) {
			prestamo = true;
			prestados++;
		}
		return prestamo;
	}

	/**
	 * Comprueba si la devolucion es posible o no
	 * 
	 * @return Devuelve si es posible o no la devolucion
	 */
	boolean devolucion() {
		boolean devolucion = false;
		if (prestados > ejemplares) {
			devolucion = true;
			prestados--;
		}
		return devolucion;
	}

	/**
	 * Enumerador Genero
	 * @author Jaime Sevilla
	 *
	 */
	enum Genero {
		Narrativo, Lirico, Dramatico, Didactico, Poetico
	}

	/**
	 * Getter de Genero
	 * 
	 * @return Devuelve el valor de genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Setter de genero
	 * 
	 * @param genero Valor de genero dado por el usuario
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + ", genero=" + genero + "]";
	};
	

}
