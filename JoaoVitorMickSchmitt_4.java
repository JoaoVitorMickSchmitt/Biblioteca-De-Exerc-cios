import java.util.Scanner;

public class JoaoVitorMickSchmitt_4 {

	public static void main(String[] args) {
		// Um aluno se v� com necessidade de ajuda na aula e logo tem a ideia de um
		// algoritmo,
//		pensando nisso, ele descreve como deve funcionar: o usu�rio seleciona a op��o onde 
//		1) Solicita 3 notas e calcula a m�dia, 
//		2) Retorna os dados do aluno em quest�o (informe seu nome e e-mail), 
//		3) Solicita 5 valores, verifica e retorna qual � o maior e o menor. 
//		 A op��o 0 encerra o programa e qualquer outra � declarada como inv�lida, al�m disso, informe 
//		quantas vezes o usu�rio escolheu op��es v�lidas antes de encerrar o programa e quantas inv�lidas. 

		Scanner input = new Scanner(System.in);

		double minValor = Integer.MAX_VALUE;
		double maiorValor = Integer.MIN_VALUE;
		int contador = 0;
		int somaNota = 0;

		System.out.println("1) Solicita 3 notas e calcula a m�dia, \r\n"
				+ "2) Retorna os dados do aluno em quest�o (informe seu nome e e-mail), \r\n"
				+ "3) Solicita 5 valores, verifica e retorna qual � o maior e o menor. \r\n");
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
				System.out.println(" a m�dia sera " + media);
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

					System.out.println(" qual � o valor");
					int valor = input.nextInt();

					if (valor > maiorValor) {
						maiorValor = valor;

					}
					if (valor < minValor) {
						minValor = valor;

					}

				}
				
				
				System.out.println(" o maior valor � " + maiorValor + " e o menor valor � " + minValor);
				break;
			}

		} if (opera == 0) {
			System.out.println(" fim do programa "+contador+" vezes que voce usou o programa de maneira v�lida ");
			
		}

	}

}
