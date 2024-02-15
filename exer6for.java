import java.util.Scanner;

public class exer6for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador = 0;
		double somaAltura = 0;
		System.out.println("Qual é sua altura?");
		double altura = input.nextDouble();

		while (altura != 0) {
			contador++;
			somaAltura = altura + somaAltura;

			System.out.println("Qual é sua altura?");
			altura = input.nextDouble();

		}

		double mediaAltura = somaAltura / contador;
		System.out.println("A média das alturas é: " + mediaAltura);

	}
}