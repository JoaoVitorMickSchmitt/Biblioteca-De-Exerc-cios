import java.util.Iterator;
import java.util.Scanner;

public class exerRevisao15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor[] = new int[5];

		int contador = 0;

		System.out.println(" insira a opção que voce quer no vetor 1/ 2 / 3 / 4 / 5 ");
		int opcao = input.nextInt();

		while (opcao != 5) {

			if (opcao == 1) {
				if (contador >= vetor.length) {
					System.out.println("não há lugar ");

				} else {

					System.out.println(" insira um valor para o vetor");

					int numVetor = input.nextInt();

					vetor[contador] = numVetor;
					contador++;
				}
			}

			if (opcao == 2) {
				System.out.println(" insira um valor para procurar ");
				int Procurar = input.nextInt();
				boolean cleito = false;
				for (int i = 0; i < vetor.length; i++) {

					if (Procurar == vetor[i]) {
						System.out.println(" esse valor existe no vetor");

						cleito = true;
					}
					if (cleito == false) {
						System.out.println(" nao existe esse valor no vetor");
						break;
					}

				}

			}
			if (opcao == 3) {
				System.out.println(" insira o numero que voce quer alterar ");
				int numeroTroca = input.nextInt();

				for (int i = 0; i < vetor.length; i++) {
					boolean cleito1 = false;
					if (numeroTroca == vetor[i]) {
						System.out.println(" agora insira o valor para trocar");
						int numeroTroca2 = input.nextInt();
						vetor[i] = numeroTroca2;
						cleito1 = true;
					}
					if (cleito1 == false) {
						System.out.println(" esse numero não está no vetor");
						break;
					}

				}

			}
				if (opcao == 4) {
					for (int i = 0; i < vetor.length; i++) {
						System.out.println(vetor[i]);
					}
				}
				
			

			System.out.println(" insira a opção que voce quer no vetor 1/ 2 / 3 / 4 / 5 ");
			opcao = input.nextInt();

		}

	}

}
