package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String departamento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el valor del departamento (Electronica, Alimentacion, Drogueria): ");
		departamento = sc.next();
		Articulo articulo = new Articulo("Juan", 1.5, 4, Articulo.Departamento.valueOf(departamento));
		sc.close();

		articulo.almacenar(5);
		System.out.format("%.3f", articulo.getPVP());
		System.out.println();
		articulo.imprime();
		System.out.println(articulo.getPVPDescuento(25));
		System.out.println(articulo.vender(2) ? "Ha sido vendido" : "No puede ser vendido");
		System.out.println(articulo.toString());
	}

}
