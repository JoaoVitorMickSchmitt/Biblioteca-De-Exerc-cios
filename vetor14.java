import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class vetor14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int posicao = 0;

		int vetor[] = new int[5];
		System.out.println(
				" voce tem as seguintes opções - 1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário"
						+ " se o valor foi incluído no vetor ou não;\r\n"
						+ "- “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;\r\n"
						+ "- “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;\r\n"
						+ "- “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;\r\n"
						+ "- “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;\r\n"
						+ "- “0 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.");
		int opcao = input.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {
				System.out.print("Informe o valor a ser incluído: ");
				int valor = input.nextInt();
				if (posicao < vetor.length) {
					vetor[posicao] = valor;
					posicao++;
					System.out.println("valor incluido");

				} else {
					System.out.println(" não há espaço no vetor");

				}
			}

			if (opcao == 2) {
				boolean cleito2 = false;
				System.out.println("informe o valor a pesquisar");
				int pesquisa = input.nextInt();
				for (int j = 0; j < vetor.length; j++) {

					if (vetor[j] == pesquisa) {

						System.out.println(" esse valor já foi encontrado :) ");

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
				System.out.println(" informe um número a ser alterado ");
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
					System.out.println("valor não alterado, pois ele nao existe no vetor ");
					break;
				}

			}

			if (opcao == 4) {

				boolean cleito4 = false;
				System.out.println(" informe um número a ser excluido ");
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
					System.out.println("valor não excluido");
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
					" \n voce tem as seguintes opções - 1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário"
							+ " se o valor foi incluído no vetor ou não;\r\n"
							+ "- “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;\r\n"
							+ "- “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;\r\n"
							+ "- “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;\r\n"
							+ "- “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;\r\n"
							+ "- “0 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.");
			opcao = input.nextInt();

		}
	}

}
