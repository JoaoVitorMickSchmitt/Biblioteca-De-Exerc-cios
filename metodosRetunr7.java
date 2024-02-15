import java.util.Iterator;
import java.util.Scanner;

public class metodosRetunr7 {

	public static void main(String[] args) {

//Faça um programa que descubra:
//a) O maior elemento de um vetor.
//b) O menor elemento.
//c) A média dos valores

		Scanner input = new Scanner(System.in);

		System.out.println(" inisra a quantidade de posições no seu vetor");
		int posicoes = input.nextInt();

		int vetor[] = new int[posicoes];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" insira o valor  na posição" + i + " ?");
			int num1 = input.nextInt();
			vetor[i] = num1;
		}

		System.out.println(" o maior valor sera " + respostas(vetor));
		System.out.println(" o menor valor sera " + MenorValor(vetor));
		System.out.println("a media dos valores sera " + respostasMédia(vetor, posicoes));

	}

	public static int respostas(int vetor[]) {
		int maiorValor = Integer.MIN_VALUE;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		return maiorValor;

	}

	public static int MenorValor(int vetor[]) {
		int minValor = Integer.MAX_VALUE;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < minValor) {
				minValor = vetor[i];
			}
		}
		return minValor;

	}

	public static double respostasMédia(int vetor[], int posicoes) {

		double somaNotas = 0;

		for (int i = 0; i < vetor.length; i++) {

			somaNotas += vetor[i];

		}

		double mediaNotas = somaNotas / posicoes;
		return mediaNotas;

	}

}
