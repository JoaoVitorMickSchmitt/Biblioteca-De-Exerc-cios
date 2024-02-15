import java.util.Scanner;

public class exerRevisao19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaIdade = 0;
		double maisGols = Integer.MIN_VALUE;
		double maisGols2 = Integer.MIN_VALUE;
		double idadeMaisGols = 0;
		double MultiGols = 0;
		double[][] matriz = {

				{ 20, 16, 0.5 }, { 25, 19, 1 }, { 24, 25, 0.4 }, { 28, 10, 1.2 }, { 19, 10, 1.4 }, { 22, 20, 0.9 }

		};

//		A primeira coluna é a idade do atleta
//		A segunda coluna é a quantidade de jogos que esse atleta jogou
//		A terceira coluna é a média de gols por partida desse atleta
//
//		Determinar:
//		a) Qual é a média de idade dos atletas?
//		b) Qual a idade do atleta que mais fez gols?
//		c) Crie uma segunda matriz que em vez da média de gols por partida 
//		mostre quantos gols esse atleta fez essa temporada

		for (int i = 0; i < matriz.length; i++) {

			somaIdade = somaIdade + matriz[i][0];
			MultiGols = matriz[i][1] * matriz[i][2];

			if (MultiGols > maisGols2) {
				maisGols = matriz[i][0];
				maisGols2 = MultiGols;

			}

		}
		double[][] matriz2 = new double[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {

		}

		double mediaIdade = somaIdade / 6;

		System.out.println(mediaIdade);
		System.out.println(maisGols);

	}

}
