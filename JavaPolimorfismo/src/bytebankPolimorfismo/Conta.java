package bytebankPolimorfismo;

import bytebankPolimorfismo.Cliente;

public abstract class Conta {
	protected double saldo;
	protected int agencia;
	private int numero;
	private static int total;
	private Cliente titular;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Nao pode valor menor ou igual a zero!");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Nao pode valor menor ou igual a zero!");
			return;
		}
		this.numero = numero;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(this.saldo >= valor) {
			this.saca(valor);
			conta.deposita(valor);
			return true;
		}
		return false;
	}
}
