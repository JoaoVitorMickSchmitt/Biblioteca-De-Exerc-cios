import java.util.Scanner;

public class JoaoVitorMickSchmitt3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaTemperatura = 0;
		double mediaTemperatura = 0;
		double mediaTemperaturaHora = 0;
		double SomaTemperaturaHora = 0;

		double[][] matriz = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

		// Você foi atarefado de desenvolver um programa que realiza uma análise de
		// dados em
//		uma array bidimensional que representa a informação da temperatura de uma 
//		determinada semana. Cada linha corresponde a um dia da semana e cada coluna 
//		corresponde a uma hora do dia. 
//		Calcule: 

//		b) A média da hora de todos os dias da semana. O usuário entrará com a hora, por 
//		exemplo 15, então você deve pesquisar na coluna correspondente. 
//		c) Qual dia da semana teve a maior amplitude térmica.

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

			}
			System.out.println("");
		}

		System.out.println("entre com um dia da semana");
		String diaSemana = input.next();

		if (diaSemana.equals("segunda")) {

			for (int i = 0; i < matriz[0].length; i++) {
				somaTemperatura += matriz[0][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Segunda é de " + mediaTemperatura);

		}
		if (diaSemana.equals("terça")) {

			for (int i = 0; i < matriz[1].length; i++) {
				somaTemperatura += matriz[1][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Terça é de " + mediaTemperatura);

		}
		if (diaSemana.equals("quarta")) {

			for (int i = 0; i < matriz[2].length; i++) {
				somaTemperatura += matriz[2][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Quarta é de " + mediaTemperatura);

		}
		if (diaSemana.equals("quinta")) {

			for (int i = 0; i < matriz[3].length; i++) {
				somaTemperatura += matriz[3][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Quinta é de " + mediaTemperatura);

		}
		if (diaSemana.equals("sexta")) {

			for (int i = 0; i < matriz[4].length; i++) {
				somaTemperatura += matriz[4][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Sexta é de " + mediaTemperatura);

		}
		if (diaSemana.equals("sabado")) {

			for (int i = 0; i < matriz[5].length; i++) {
				somaTemperatura += matriz[5][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Sábado é de " + mediaTemperatura);

		}
		if (diaSemana.equals("domingo")) {

			for (int i = 0; i < matriz[6].length; i++) {
				somaTemperatura += matriz[6][i];
			}
			mediaTemperatura = somaTemperatura / 24;
			System.out.println(" a media da temperatura de Domingo é de " + mediaTemperatura);

		}

		System.out.println(" entre com as horas das semanas ");
		String horasSemanas = input.next();

		if (horasSemanas.equals("1")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][0];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("2")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][1];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("3")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][2];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("4")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][3];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("5")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][4];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("6")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][5];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("7")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][6];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("8")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][7];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("9")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][8];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("10")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][9];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("11")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][10];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("12")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][11];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("13")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][12];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("12")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][11];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("13")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][12];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("14")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][13];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("15")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][14];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("16")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][15];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("17")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][16];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("18")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][17];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("19")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][18];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("20")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][19];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("21")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][20];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("22")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][21];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("23")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][23];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}
		if (horasSemanas.equals("24")) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					SomaTemperaturaHora += matriz[i][23];

				}
			}
			mediaTemperaturaHora = SomaTemperaturaHora / 7;
			System.out.println(" a média das temperaturas de todas as 00:00 será " + mediaTemperaturaHora);
		}

	}

}
