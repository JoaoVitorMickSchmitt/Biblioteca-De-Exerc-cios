import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("insira o numer " + (i + 1));
			numeros[i] = input.nextInt();

		}
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.println(" os numeros serão " + (i + 1) + " para " + numeros[i]);

		}

	}

}
