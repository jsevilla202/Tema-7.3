package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("30495353Z", 100000);
		CuentaCorriente cuenta2 = new CuentaCorriente("30495353Z", "Pepe", 100000);
		
		System.out.println("CUENTA 1");
		cuenta1.ingresarDinero(200);
		cuenta1.mostrarDinero();
		cuenta1.sacarDinero(100);
		cuenta1.mostrarDinero();
		
		System.out.println();
		System.out.println("CUENTA 2");
		cuenta2.ingresarDinero(200);
		cuenta2.mostrarDinero();
		cuenta2.sacarDinero(100);
		cuenta2.mostrarDinero();

	}

}
