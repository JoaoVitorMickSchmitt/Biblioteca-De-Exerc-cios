import java.util.Scanner;

public class JoaoVitorMickSchmitt_4 {

	public static void main(String[] args) {
		// Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		// algoritmo,
//		pensando nisso, ele descreve como deve funcionar: o usuário seleciona a opção onde 
//		1) Solicita 3 notas e calcula a média, 
//		2) Retorna os dados do aluno em questão (informe seu nome e e-mail), 
//		3) Solicita 5 valores, verifica e retorna qual é o maior e o menor. 
//		 A opção 0 encerra o programa e qualquer outra é declarada como inválida, além disso, informe 
//		quantas vezes o usuário escolheu opções válidas antes de encerrar o programa e quantas inválidas. 

		Scanner input = new Scanner(System.in);

		double minValor = Integer.MAX_VALUE;
		double maiorValor = Integer.MIN_VALUE;
		int contador = 0;
		int somaNota = 0;

		System.out.println("1) Solicita 3 notas e calcula a média, \r\n"
				+ "2) Retorna os dados do aluno em questão (informe seu nome e e-mail), \r\n"
				+ "3) Solicita 5 valores, verifica e retorna qual é o maior e o menor. \r\n");
		int opera = input.nextInt();

		while (opera != 0) {
			contador++;
			if (opera == 1) {

				System.out.println(" insira a sua  1 nota");
				int nota1 = input.nextInt();

				System.out.println(" insira a sua  2 nota");
				int nota2 = input.nextInt();

				System.out.println(" insira a sua  3 nota");
				int nota3 = input.nextInt();

				somaNota = somaNota + (nota1 + nota2 + nota3);

				double media = somaNota / 3;
				System.out.println(" a média sera " + media);
			break;
			
			}
			

			if (opera == 2) {

				System.out.println(" insira o seu nome por favor");
				String nome = input.next();

				System.out.println(" insira o seu e-mail por favor");
				String email = input.next();
				break;
			}
			

			if (opera == 3) {

				for (int i = 0; i <= 5; i++) {

					System.out.println(" qual é o valor");
					int valor = input.nextInt();

					if (valor > maiorValor) {
						maiorValor = valor;

					}
					if (valor < minValor) {
						minValor = valor;

					}

				}
				
				
				System.out.println(" o maior valor é " + maiorValor + " e o menor valor é " + minValor);
				break;
			}

		} if (opera == 0) {
			System.out.println(" fim do programa "+contador+" vezes que voce usou o programa de maneira válida ");
			
		}

	}

}
