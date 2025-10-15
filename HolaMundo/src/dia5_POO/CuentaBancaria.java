package dia5_POO;
/*
 * CuentaBancaria cuenta = new CuentaBancaria(12345, 1000, "Juan Pérez");
    
    cuenta.mostrarSaldo();  // Saldo disponible: $1000.0
    cuenta.depositar(500);  // Depósito realizado: +$500.0
    cuenta.retirar(200);    // Retiro realizado: -$200.0
    cuenta.retirar(2000);   // Error: Saldo insuficiente
    cuenta.mostrarSaldo();  // Saldo disponible: $1300.0
 */

public class CuentaBancaria {
	int numeroCuenta;
	double saldo;
	String titular;

	public CuentaBancaria(int numeroCuenta, double saldo, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void depositar(double monto) {
		this.saldo += monto;
		System.out.println("Deposito realizado correctamente");
	}

	public void retirar(double monto) {
		if (saldo>=monto) {
			this.saldo = this.saldo - monto;
			System.out.println("Retiro realizado correctamente");
		}else {
			System.out.println("No tiene saldo suficiente");
		}
	}
	
	public void mostrarSaldo() {
		System.out.println("Su saldo disponible es: " + this.saldo);
	}

}
