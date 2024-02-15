import java.util.Scanner;

public class metodosInicial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Faça um programa em que o usuário entre com um número de 1 a 4
//		Com o número 1 sendo verão, 2 sendo outono...
//		Dependendo de o que o usuário informa, imprima:
//
//		É verão
//		E o tempo está quente
//
//		Ou
//
//		É inverno
//		E está frio
//
//		Faça um método para cada estação do ano

		System.out.println("entre com o numero 1 - verao / 2 outono/ 3 -inverno / 4 - primavera");
		int num = input.nextInt();

		if (num == 1) {
			Entrada();
		}
		if (num == 2) {
			Entrada2();
		}
		if (num == 3) {
			Entrada3();
		}
		if (num == 4) {
			Entrada4();
		}

	}

	public static void Entrada() {

		System.out.println("é verao e está quente");
	}

	public static void Entrada2() {

		System.out.println("é outono  e está quente");
	}

	public static void Entrada3() {

		System.out.println("é inverno e está Frio");
	}

	public static void Entrada4() {

		System.out.println("é primavera e esta quentinho");
	}

}
