package bytebankPolimorfismo;

public class Gerente extends Funcionario implements Autenticavel {
	
    public double getBonificacao() {
        return this	.getBonificacao() + super.getSalario();
    }

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
