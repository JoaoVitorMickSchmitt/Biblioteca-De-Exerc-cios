import java.util.Scanner;

public class matriz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double notaMJovem = 0;
		int mulherJovem = Integer.MAX_VALUE;
		double somaNota = 0;
		double mediaNota = 0;
		int contadorH = 0;
		double somaNotaH = 0;
		double mediaNotaH = 0;
		int contadorMVelha = 0;

		int matriz[][] = new int[5][3];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Qual seu sexo? (1=feminino 2=masculino)");
			matriz[i][0] = input.nextInt();

			System.out.println("Dê uma nota para o cinema");
			matriz[i][1] = input.nextInt();

			System.out.println("Qual é sua idade?");
			matriz[i][2] = input.nextInt();

			if (matriz[i][0] == 2) {
				contadorH = contadorH + 1;
				somaNotaH = somaNotaH + matriz[i][1];
			} else if (matriz[i][0] == 1) {
				if (matriz[i][2] < mulherJovem) {
					mulherJovem = matriz[i][2];
					notaMJovem = matriz[i][1];
				}

			}

			somaNota = somaNota + matriz[i][1];

		}

		mediaNota = somaNota / 5;
		for (int i = 0; i < matriz.length; i++) {

			if (matriz[i][0] == 1 && matriz[i][2] > 50 && matriz[i][1] > mediaNota) {
				contadorMVelha = contadorMVelha + 1;
			}
		}

		mediaNotaH = somaNotaH / contadorH;

		System.out.println(mediaNota);
		System.out.println(mediaNotaH);
		System.out.println(notaMJovem);
		System.out.println(contadorMVelha);
	}

}
		