

import java.util.Scanner;

/**
 * @author jvmschmitt
 *
 */
public class desafio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valorMIn = Integer.MIN_VALUE;
		double valorMaior = Integer.MAX_VALUE;

		double numA = 0;
		double numB = 0;
		double numC = 0;

		System.out.println("ENTRE COM O CARACTER A ");
		numA = input.nextDouble();

		System.out.println("ENTRE COM O CARACTER B ");
		numB = input.nextDouble();

		System.out.println("ENTRE COM O CARACTER C ");
		numC = input.nextDouble();

		double soma = -numB / numA;
		double produto = numC / numA;
		outerLoop: for (double resposta1 = -10000; resposta1 <= 1000; resposta1++) {

			for (double resposta2 = -1000; resposta2 <= 1000; resposta2++) {

				if (resposta1 + resposta2 == soma && resposta1 * resposta2 == produto) {
					System.out.println("os valores serão " + resposta1 + " e " + resposta2);
					break outerLoop;

				}
			}

		}

	}

}
