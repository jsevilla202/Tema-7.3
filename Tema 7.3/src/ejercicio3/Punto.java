package ejercicio3;

/**
 * Clase de las funciones de puntos
 * @author Jaime Sevilla
 *
 */
public class Punto {
	/**
	 * Posición x
	 */
	int x;
	/**
	 * Posición y
	 */
	int y;
	
	/**
	 * Constructor con todos los parametros
	 * @param x Parametro de entrada que obtiene el valor de la posición x
	 * @param y Parametro de entrada que obtiene el valor de la posición y
	 */
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Imprime la posición
	 */
	void imprime() {
		System.out.println("("+x+", "+y+")");
	}
	
	/**
	 * Establece nuevos valores para x e y
	 * @param x Parametro de entrada que obtiene el valor de la posición x
	 * @param y Parametro de entrada que obtiene el valor de la posición y
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Suma el desplazamiento a los puntos x e y
	 * @param dx Parametro de entrada que obtiene se suma al valor de la posición x
	 * @param dy Parametro de entrada que obtiene se suma al valor de la posición y
	 */
	void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Calcula la distancia entre puntos
	 * @param p Punto al que calcular la distancia
	 */
	void distancia(Punto p) {
		double d;
		
		d = Math.sqrt(Math.pow(p.x-this.x, 2) + Math.pow(p.y-this.y, 2));
		System.out.print("La distancia es: ");
		System.out.format("%.3f", d);
	}
	
}
