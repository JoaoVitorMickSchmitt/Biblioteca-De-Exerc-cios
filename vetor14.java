import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class vetor14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int posicao = 0;

		int vetor[] = new int[5];
		System.out.println(
				" voce tem as seguintes op��es - 1 � Incluir valor�: nesta op��o inclua o valor no fim do vetor, se houver espa�o. Informe o usu�rio"
						+ " se o valor foi inclu�do no vetor ou n�o;\r\n"
						+ "- �2 � Pesquisar valor�: nesta op��o leia um valor e informe se o mesmo est� no vetor;\r\n"
						+ "- �3 � Alterar valor�: nesta op��o informe um n�mero a ser alterado e um novo n�mero a ser colocado no lugar (s� para a primeira ocorr�ncia deste n�mero). Caso o n�mero a ser alterado exista no vetor, substitua-o pelo novo n�mero. Caso contr�rio, informe �n�mero n�o encontrado�;\r\n"
						+ "- �4 � Excluir valor�: nesta op��o leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usu�rio se o valor foi exclu�do do vetor ou n�o. A posi��o que foi exclu�da o valor deve ser preenchida pelo valor seguinte, sucessivamente at� o final dos valores do vetor;\r\n"
						+ "- �5 � Mostrar valores�: nesta op��o mostre todos os valores armazenados no vetor;\r\n"
						+ "- �0 � Sair do sistema�: nesta op��o deve ser finalizada a execu��o do programa.");
		int opcao = input.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {
				System.out.print("Informe o valor a ser inclu�do: ");
				int valor = input.nextInt();
				if (posicao < vetor.length) {
					vetor[posicao] = valor;
					posicao++;
					System.out.println("valor incluido");

				} else {
					System.out.println(" n�o h� espa�o no vetor");

				}
			}

			if (opcao == 2) {
				boolean cleito2 = false;
				System.out.println("informe o valor a pesquisar");
				int pesquisa = input.nextInt();
				for (int j = 0; j < vetor.length; j++) {

					if (vetor[j] == pesquisa) {

						System.out.println(" esse valor j� foi encontrado :) ");

						cleito2 = true;
						break;

					}

				}
				if (cleito2 == false) {
					System.out.println(" o valor nao foi encontrado tente novamente");

				}
			}
			if (opcao == 3) {
				boolean cleito = false;
				System.out.println(" informe um n�mero a ser alterado ");
				int numeroAlte = input.nextInt();
				for (int j = 0; j < vetor.length; j++) {

					if (numeroAlte == vetor[j]) {
						System.out.println(" agora, altere esse valor por um outro numero ");
						int novoNumero = input.nextInt();

						vetor[j] = novoNumero;
						System.out.println("valor alterado");

						cleito = true;

					}
				}
				if (cleito == false) {
					System.out.println("valor n�o alterado, pois ele nao existe no vetor ");
					break;
				}

			}

			if (opcao == 4) {

				boolean cleito4 = false;
				System.out.println(" informe um n�mero a ser excluido ");
				int numeroExclu = input.nextInt();

				for (int j = 0; j < vetor.length; j++) {

					if (numeroExclu == vetor[j]) {
						for (int k = j; k < posicao - 1; k++) {

							vetor[k] = vetor[k + 1];

						}
						vetor[posicao - 1] = 0;
						posicao--;
						System.out.println("excluido");
						cleito4 = true;
						break;
					}

				}
				if (cleito4 == false) {
					System.out.println("valor n�o excluido");
					break;
				}

			}

			if (opcao == 5) {
				System.out.println("Valores no vetor:");

				System.out.print("[");
				for (int j = 0; j < posicao; j++) {
					System.out.print(vetor[j] + ", ");
				}
				System.out.print("]");
			}

			System.out.println(
					" \n voce tem as seguintes op��es - 1 � Incluir valor�: nesta op��o inclua o valor no fim do vetor, se houver espa�o. Informe o usu�rio"
							+ " se o valor foi inclu�do no vetor ou n�o;\r\n"
							+ "- �2 � Pesquisar valor�: nesta op��o leia um valor e informe se o mesmo est� no vetor;\r\n"
							+ "- �3 � Alterar valor�: nesta op��o informe um n�mero a ser alterado e um novo n�mero a ser colocado no lugar (s� para a primeira ocorr�ncia deste n�mero). Caso o n�mero a ser alterado exista no vetor, substitua-o pelo novo n�mero. Caso contr�rio, informe �n�mero n�o encontrado�;\r\n"
							+ "- �4 � Excluir valor�: nesta op��o leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usu�rio se o valor foi exclu�do do vetor ou n�o. A posi��o que foi exclu�da o valor deve ser preenchida pelo valor seguinte, sucessivamente at� o final dos valores do vetor;\r\n"
							+ "- �5 � Mostrar valores�: nesta op��o mostre todos os valores armazenados no vetor;\r\n"
							+ "- �0 � Sair do sistema�: nesta op��o deve ser finalizada a execu��o do programa.");
			opcao = input.nextInt();

		}
	}

}
