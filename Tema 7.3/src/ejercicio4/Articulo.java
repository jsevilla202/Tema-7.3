package ejercicio4;

public class Articulo {
	private String nombre;
	private double precio;
	public static final int IVA = 21;
	private int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	void imprime() {
		System.out.println("El producto " + nombre + " tiene un precio de " + (precio+(precio*(IVA/100))) + " y quedan " + cuantosQuedan + " en el almacen");
	}
	
	double getPVP() {
		double precioiva;
		
		precioiva = precio+ precio*IVA/100;
		
		return precioiva;
	}
	
	double getPVPDescuento(double descuento) {
		double precioiva;
		double preciodescuento;
		
		precioiva = precio+(precio*(IVA/100));
		
		preciodescuento = precioiva - precioiva*(descuento/100);
		
		return preciodescuento;
	}
	
	boolean vender(int cantidad) {
		boolean vender = false;
		if(cuantosQuedan-cantidad>=0) {
			vender = true;
			cuantosQuedan-=cantidad;
		}
		return vender;
	}
	
	void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
		System.out.println("Se han añadido " + cantidad + " unidades");
	}
	
	
	
}
