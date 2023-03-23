package ejercicio4;

public class Main {

	public static void main(String[] args) {
		
		Articulo articulo = new Articulo("Juan", 1.5, 4);
		
		articulo.almacenar(5);
		System.out.format("%.3f",  articulo.getPVP());
		System.out.println();
		articulo.imprime();
		System.out.println(articulo.getPVPDescuento(25));
		System.out.println(articulo.vender(2)? "Ha sido vendido":"No puede ser vendido");
	}

}
