package bytebankPolimorfismo;

public class Program {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
        g1.setSenha(2222);

        SistemaInterno si = new SistemaInterno();

        si.autentica(g1);
    }
}
