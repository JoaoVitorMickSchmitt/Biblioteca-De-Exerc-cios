import java.text.DecimalFormat;
import java.util.Scanner;

public class exer7for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador = 0;
		double somaAltura = 0;
		double maisAlto = 0;
		double maisBaixo = Integer.MAX_VALUE;
		double numAlto = 0;
		double numBaixo = 0;

		System.out.println("Qual � o n�mero de inscri��o do atleta?");
		int numInscricao = input.nextInt();
		System.out.println("Qual � a altura do atleta?");
		double altura = input.nextDouble();

		while (numInscricao != 0) {

			contador++;
			somaAltura = somaAltura + altura;

			if (altura > maisAlto) {
				numAlto = numInscricao;
				maisAlto = altura;

			}
			if (altura < maisBaixo) {
				maisBaixo = altura;
				numBaixo = numInscricao;
			}

			System.out.println("Qual � o n�mero de inscri��o do atleta?");
			numInscricao = input.nextInt();
			if (numInscricao == 0) {
				break;
			}

			System.out.println("Qual � a altura do atleta?");
			altura = input.nextDouble();

		}

			double media = somaAltura / contador;
			System.out.println("A m�dia das alturas �: " + media);
		System.out.println("O atleta mais alto tem: " + maisAlto + "m e seu n�mero de inscri��o �: " + numAlto);
		System.out.println("O atleta mais baixo tem: " + maisBaixo + "m e seu n�mero de inscri��o �: " + numBaixo);
	}
}
