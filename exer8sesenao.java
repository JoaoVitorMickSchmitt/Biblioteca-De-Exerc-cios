import java.util.Scanner;

public class exer8sesenao {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o ano de nascimento
		// de 3 irmãos, escrever uma
		// mensagem que indique se eles são TRIGÊMEOS, GÊMEOS,
		// APENAS IRMÃOS.
		// Considere que eles são GÊMEOS se dois deles possuem
		// a mesma idade e o outro
		// diferente dos demais, e apenas irmãos se todas as
		// idades forem diferentes.

		Scanner input = new Scanner(System.in);

		System.out.println("escreva o ano de nascimento do 1 irmão");
		int idade1 = input.nextInt();

		System.out.println("escreva o ano de nascimento do 2 irmão");
		int idade2 = input.nextInt();

		System.out.println("escreva o ano de nascimento do 3 irmão");
		int idade3 = input.nextInt();

		if (idade1 == idade2 && idade1 == idade3 && idade2 == idade3)
			System.out.println("eles são trigemeos");
		
		else if (idade1 == idade2 || idade1 == idade3)
			System.out.println("eles são gêmeos");

		else if (idade2 == idade3)
			System.out.println("eles são gêmeos");


		else if (idade1 != idade2 && idade1 != idade3 && idade2 != idade3)
			System.out.println("são irmaos");

		
		else {System.out.println("errado");
	}

}
}
