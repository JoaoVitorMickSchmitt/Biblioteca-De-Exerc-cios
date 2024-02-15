import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class exer9Revisao {

	public static void main(String[] args) {

//Dada uma turma de alunos, contendo seu nome e nota de 3 provas descreva um algoritmo para
//informar a média de cada aluno.
//Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

		DecimalFormat df =  new DecimalFormat("0.0");
		Scanner input = new Scanner(System.in);

		String matriz[][] = new String[100][5];

		for (int i = 0; i < matriz.length; i++) {

			System.out.println("de o seu nome");
			String nome = input.next();
			if (nome.equals("fim")) {
				break;
			}
			matriz[i][0] = nome;

			double somaNotas = 0;
			int numProvas = 3;

			for (int j = 1; j < 4 && !matriz[i][0].equalsIgnoreCase("fim"); j++) {

				System.out.println("digite o a sua nota: ");
				String nota = input.next();

				matriz[i][j] = nota;
				somaNotas += Double.parseDouble(nota);

			}
			double media = somaNotas / numProvas;

			matriz[i][4] = String.valueOf(media);

		}

		for (int i = 0; i < matriz.length && matriz[i][0] != "fim"; i++) {
			System.out.println("Nome: " + matriz[i][0]);
			System.out.println("Nota 1: " + matriz[i][1]);
			System.out.println("Nota 2: " + matriz[i][2]);
			System.out.println("Nota 3: " + matriz[i][3]);
			System.out.println("Media: " + matriz[i][4]);
		}

	}

}
