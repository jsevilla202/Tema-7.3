package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String sexo;
		Scanner sc = new Scanner(System.in);
		
		CuentaCorriente cuenta1 = new CuentaCorriente("30495353Z", 100000);
		CuentaCorriente cuenta2 = new CuentaCorriente("30495353Z", "Pepe", 100000);
		
		System.out.println("CUENTA 1");
		cuenta1.ingresarDinero(200);
		cuenta1.mostrarDinero();
		cuenta1.sacarDinero(100);
		cuenta1.mostrarDinero();
		
		do {
			System.out.print("¿Es HOMBRE o MUJER? ");
			sexo = sc.nextLine();
		}
		while(!sexo.equals("HOMBRE") && !sexo.equals("MUJER"));
		cuenta1 = new CuentaCorriente(cuenta1, sexo);
		
		System.out.println(cuenta1.toString());
		
		System.out.println();
		
		System.out.println("CUENTA 2");
		cuenta2.ingresarDinero(200);
		cuenta2.mostrarDinero();
		cuenta2.sacarDinero(100);
		cuenta2.mostrarDinero();
		
		do {
			System.out.print("¿Es HOMBRE o MUJER? ");
			sexo = sc.nextLine();
		}
		while(!sexo.equals("HOMBRE") && !sexo.equals("MUJER"));
		cuenta2 = new CuentaCorriente(cuenta2, sexo);
		
		System.out.println(cuenta2.toString());
	}

}
