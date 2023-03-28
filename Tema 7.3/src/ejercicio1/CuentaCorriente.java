package ejercicio1;

public class CuentaCorriente {
	private String DNI;
	private String nombre;
	private double saldo;
	
	enum Sexo {HOMBRE, MUJER};
	private Sexo sexo;
	
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
	
	public CuentaCorriente(CuentaCorriente CC, String sexo) {
		super();
		DNI = CC.DNI;
		this.nombre = CC.nombre;
		this.saldo = CC.saldo;
		this.sexo = Sexo.valueOf(sexo);
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [DNI=" + DNI + ", nombre=" + nombre + ", saldo=" + saldo + ", sexo=" + sexo + "]";
	}
	
	
	
}
