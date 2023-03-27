package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String genero;
		Scanner sc = new Scanner(System.in);
		Libro libro1 = new Libro();
		System.out.println("Inserte el genero del libro (Narrativo, Lirico, Dramatico, Didactico, Poetico): ");
		genero = sc.next();
		Libro libro2 = new Libro("Juan de las Cabezas de San Juan Dominguez de la Huerta Perez", "Juan Perez", 10, 0,
				Libro.Genero.valueOf(genero));
		System.out.println("Inserte el genero del libro (Narrativo, Lirico, Dramatico, Didactico, Poetico): ");
		genero = sc.next();
		Libro libro3 = new Libro("Jaime de los Santos Sevilla de Cordoba Alvarez", "Jaime Sevilla", 10, 10,
				Libro.Genero.valueOf(genero));
		sc.close();

		System.out.println(libro1.devolucion() ? "Su libro ha sido devuelto" : "Su libro no ha podido ser devuelto");
		System.out.println(libro1.prestamo() ? "Aquí tiene su libro" : "Este libro no puede ser prestado actualmente");
		System.out.println();
		System.out.println(libro2.devolucion() ? "Su libro ha sido devuelto" : "Su libro no ha podido ser devuelto");
		System.out.println(libro2.prestamo() ? "Aquí tiene su libro" : "Este libro no puede ser prestado actualmente");
		System.out.println();
		System.out.println(libro3.devolucion() ? "Su libro ha sido devuelto" : "Su libro no ha podido ser devuelto");
		System.out.println(libro3.prestamo() ? "Aquí tiene su libro" : "Este libro no puede ser prestado actualmente");
		System.out.println();
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
	}

}
