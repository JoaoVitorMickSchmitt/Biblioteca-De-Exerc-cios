import java.util.Scanner;

public class vetor8 {

	public static void main(String[] args) {
		// Crie um vetor de 100 posi��es
//		O usu�rio vai colocando valores decimais at� ele colocar o char n
//		Calcular:
//a) Qual o menor n�mero
//	b) Qual o maior n�mero
//		c) Calcular a m�dia

		Scanner input = new Scanner(System.in);

		double contador = 0;
		double numMenor = Integer.MAX_VALUE;
		double numMaior = Integer.MIN_VALUE;
		double somaValores = 0;

		double numeros[] = new double[100];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Qual o valor que voc� quer colocar na posi��o " + i + " ?");
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
				"A m�dia ser� " + mediaValores + ", o maior n�mero ser� " + numMaior + " e o menor ser� " + numMenor);

	}

}
