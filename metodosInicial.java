import java.util.Scanner;

public class metodosInicial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Fa�a um programa em que o usu�rio entre com um n�mero de 1 a 4
//		Com o n�mero 1 sendo ver�o, 2 sendo outono...
//		Dependendo de o que o usu�rio informa, imprima:
//
//		� ver�o
//		E o tempo est� quente
//
//		Ou
//
//		� inverno
//		E est� frio
//
//		Fa�a um m�todo para cada esta��o do ano

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

		System.out.println("� verao e est� quente");
	}

	public static void Entrada2() {

		System.out.println("� outono  e est� quente");
	}

	public static void Entrada3() {

		System.out.println("� inverno e est� Frio");
	}

	public static void Entrada4() {

		System.out.println("� primavera e esta quentinho");
	}

}
