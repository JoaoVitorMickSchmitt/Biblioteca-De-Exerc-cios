import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class vetor10 {

	public static void main(String[] args) {

		// Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
		// 12 posições do tipo real.
		// Imprima quais valores desses informados são maiores que a média dos valores.
		double somaValores = 0;
		double contador = 0;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double numeros[] = new double[12];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Qual o valor que você quer colocar na posição " + i + " ?");
			numeros[i] = input.nextDouble();

			somaValores = somaValores + numeros[i];

		}

		double mediaValores = somaValores / 12;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > mediaValores) {
				System.out
						.println("os valores maiores que a média " + df.format(mediaValores) + " serão " + numeros[i]);

			}
		}

	}

}
