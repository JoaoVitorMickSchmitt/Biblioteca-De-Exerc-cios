import java.util.Scanner;

public class vetor9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double numeros[] = new double[12];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Qual o valor que você quer colocar na posição " + i + " ?");
			double num = input.nextDouble();
			numeros[i] = num;

			if (i % 2 == 0) {
				numeros[i] = (num * 0.02) + num;

			} else {
				numeros[i] = num + (num * 0.05);

			}

		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("o vetor final sera \n" + numeros[i]);
		}

	}

}
