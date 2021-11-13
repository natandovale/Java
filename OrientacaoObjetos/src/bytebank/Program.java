package bytebank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var primeiraConta = new Conta();
		var segundaConta = new Conta();
		primeiraConta.deposita(200);
		segundaConta.deposita(50);
		
		primeiraConta.transfere(50, segundaConta);
		System.out.println(primeiraConta.getSaldo());	
		System.out.println(segundaConta.getSaldo());
	}
}
