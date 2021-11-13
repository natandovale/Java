package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
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