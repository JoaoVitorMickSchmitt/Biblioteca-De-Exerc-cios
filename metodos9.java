import java.util.Iterator;
import java.util.Scanner;

public class metodos9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double vetor1[] = new double[2];
		for (int i = 0; i < vetor1.length; i++) {

			System.out.println("insira o valor do primeiro vetor");
			double num1 = input.nextDouble();
			vetor1[i] = num1;

		}

		double vetor2[] = new double[2];
		for (int i = 0; i < vetor1.length; i++) {

			System.out.println("insira o valor do primeiro vetor");
			double num2 = input.nextDouble();
			vetor2[i] = num2;

		}
		vetor3(vetor1, vetor2);
	}

	public static void vetor3(double vetor1[], double vetor2[]) {

		double vetor3[] = new double[2];
		for (int i = 0; i < 2; i++) {

			vetor3[i] = vetor1[i] + vetor2[i];

		}

		for (int i = 0; i < vetor3.length; i++) {
			System.out.println(" os valores do valor 3 serão :");
			System.out.println(vetor3[i]);
		}

	}

}
