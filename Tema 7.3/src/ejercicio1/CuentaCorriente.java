package ejercicio1;

public class CuentaCorriente {
	String DNI;
	String nombre;
	double saldo;
	
	
	public CuentaCorriente(String dNI, double saldo) {
		super();
		DNI = dNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dNI, String nombre, double saldo) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	void sacarDinero(double cantidad) {
		if(cantidad>saldo || cantidad<0) {
			System.out.println("ERROR: No tiene suficiente saldo en la cuenta");
		}
		else {
			System.out.println("Sacando saldo......");
			saldo -= cantidad;
		}
	}
	
	void ingresarDinero(double cantidad) {
		if(cantidad<0) {
			System.out.println("ERROR: No puede introducir valores negativos");
		}
		else {
			System.out.println("Ingresando saldo......");
			saldo += cantidad;
		}
	}
	
	void mostrarDinero() {
		System.out.println("Sr./Sra. " + nombre +  " con DNI " + DNI + " tiene un saldo de: " + saldo + "€");
	}
	
	
}
