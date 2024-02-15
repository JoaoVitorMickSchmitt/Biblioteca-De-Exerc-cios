import java.util.Scanner;

public class vetor8 {

	public static void main(String[] args) {
		// Crie um vetor de 100 posições
//		O usuário vai colocando valores decimais até ele colocar o char n
//		Calcular:
//a) Qual o menor número
//	b) Qual o maior número
//		c) Calcular a média

		Scanner input = new Scanner(System.in);

		double contador = 0;
		double numMenor = Integer.MAX_VALUE;
		double numMaior = Integer.MIN_VALUE;
		double somaValores = 0;

		double numeros[] = new double[100];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Qual o valor que você quer colocar na posição " + i + " ?");
			String num = input.next();

			if (num.equals("n")) {
				break;
			}
			

			double numDouble = Double.valueOf(num);
			numeros[i] = numDouble;

			somaValores = somaValores + numDouble;
			contador++;

			if (numDouble > numMaior) {
				numMaior = numDouble;
			}

			if (numDouble < numMenor) {
				numMenor = numDouble;

			}

		}

		double mediaValores = somaValores / contador;
		System.out.println(
				"A média será " + mediaValores + ", o maior número será " + numMaior + " e o menor será " + numMenor);

	}

}
