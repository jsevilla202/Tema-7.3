package ejercicio2;

/**
 *  Clase de las funciones relacionadas con la biblioteca
 * @author Jaime Sevilla
 *
 */
public class Libro {
	/**
	 * Nombre del libro
	 */
	String titulo;
	/**
	 * Nombre del autor del libro
	 */
	String autor;
	/**
	 * Numero de ejemplares disponibles
	 */
	final int ejemplares;
	/**
	 * Numero de ejemplares prestados
	 */
	int prestados;
	
	/**
	 * Constructor por defecto
	 */
	public Libro() {
		super();
		this.ejemplares = 0;
	}


	/**
	 * Constructor de todos los parametros
	 * @param titulo Parametro que recibe el valor del titulo
	 * @param autor Parametro que recibe el valor del autor
	 * @param ejemplares Parametro que recibe el valor de los ejemplares
	 * @param prestados Parametro que recibe el valor de los prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}


	/**
	 * Comprueba si el prestamo es posible o no
	 * @return Devuelve si se puede o no realizar el prestamo
	 */
	boolean prestamo() {
		boolean prestamo = false;
		if(prestados < ejemplares) {
			prestamo = true;
			prestados++;
		}
			return prestamo;
	}
	
	/**
	 * Comprueba si la devolucion es posible o no
	 * @return Devuelve si es posible o no la devolucion
	 */
	boolean devolucion() {
		boolean devolucion = false;
		if(prestados > ejemplares) {
			devolucion = true;
			prestados--;
		}
		return devolucion;
	}
	
}
