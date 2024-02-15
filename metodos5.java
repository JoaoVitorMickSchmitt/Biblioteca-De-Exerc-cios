import java.util.Scanner;

public class metodos5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Faça um programa que descubra:
		// a) O maior elemento de um vetor
		// b) O menor elemento de um vetor
		// c) A média dos valores

		// (Criar um método para cada questão)

		int menorElem = Integer.MAX_VALUE;

		System.out.println(" de o tamnha de elementos do seu vetor");
		int posiçoes = input.nextInt();
		int vetor[] = new int[posiçoes];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" qual o valor que voce quer colocar na posição " + i);
			vetor[i] = input.nextInt();

		}
		System.out.println(" agora escolja o que voce quer ver / 1 - maior valor / 2 - menor / 3 - media valor");
		int pocisao = input.nextInt();

		if (pocisao == 1) {
			maiorValor(vetor);

		}
		if (pocisao == 2) {
			menorValor(vetor);

		}
		if (pocisao == 3) {
			mediaValor(vetor);

		}

	}

	public static void maiorValor(int vetor[]) {
		int maiorElem = Integer.MIN_VALUE;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorElem) {
				maiorElem = vetor[i];
			}

		}
		System.out.println(" o maior elemento " + maiorElem);
	}

	public static void menorValor(int vetor[]) {
		int menorElem = Integer.MAX_VALUE;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorElem) {
				menorElem = vetor[i];
			}

		}
		System.out.println(" o menor elemento " + menorElem);

	}

	public static void mediaValor(int vetor[]) {
		double somaValores = 0;
		double mediaValores = 0;
		for (int i = 0; i < vetor.length; i++) {

			somaValores += vetor[i];

		}
		mediaValores = somaValores / vetor.length;
		System.out.println(mediaValores);
	}

}
