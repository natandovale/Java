
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int idade = 20;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		} else {
			System.out.println("Voc� n�o pode entrar");
		}

		System.out.println("testando condicionais");
		int idade2 = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade2 >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
		
		int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("O m�s � Janeiro");
                break;
            case 2:
                System.out.println("O m�s � Fevereiro");
                break;
            case 3:
                System.out.println("O m�s � Mar�o");
                break;
            case 4:
                System.out.println("O m�s � Abril");
                break;
            case 5:
                System.out.println("O m�s � Maio");
                break;
            case 6:
                System.out.println("O m�s � Junho");
                break;
            case 7:
                System.out.println("O m�s � Julho");
                break;
            case 8:
                System.out.println("O m�s � Agosto");
                break;
            case 9:
                System.out.println("O m�s � Setembro");
                break;
            case 10:
                System.out.println("O m�s � Outubro");
                break;
            case 11:
                System.out.println("O m�s � Novembro");
                break;
            case 12:
                System.out.println("O m�s � Dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        }
	}
}
