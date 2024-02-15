import java.util.Scanner;

public class exer12sesenao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int homemVelho = 0;
		int homemNovo = 0;
		int mulherVelha = 0;
		int mulherNova = 0;

		System.out.println("Qual é a idade do primeiro homem?");
		int idadeHUm = input.nextInt();

		System.out.println("Qual é a idade do segundo homem?");
		int idadeHDois = input.nextInt();

		System.out.println("Qual é a idade da primeira mulher?");
		int idadeMUm = input.nextInt();

		System.out.println("Qual é a idade da segunda mulher?");
		int idadeMDois = input.nextInt();

		if (idadeHUm > idadeHDois) {
			homemVelho = idadeHUm ;
			homemNovo = idadeHDois;
		}
		else {
			homemNovo = idadeHUm;
			homemVelho = idadeHDois;
		}
		if (idadeMUm > idadeMDois) {
			mulherVelha = idadeMUm ;
			mulherNova = idadeMDois;
		}
		else {
			mulherNova = idadeMUm;
			mulherVelha = idadeMDois;
		}
		
		int somaHvelhoMnova = homemVelho + mulherNova;
		int somaHnovoMvelha = homemNovo * mulherVelha;
		
		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaHvelhoMnova + "\nE o produto das idades da mulher mais velha com o homem mais novo é: " + somaHnovoMvelha);
	
	}

}