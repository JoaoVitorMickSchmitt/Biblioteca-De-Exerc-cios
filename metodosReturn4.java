import java.util.Scanner;

public class metodosReturn4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Fa�a um programa que calcule o quadrado de um n�mero caso esse n�mero seja par
//		E calcule o dobro desse n�mero caso esse n�mero seja �mpar.
//
//
//		Retorne o resultado

		System.out.println(" insira um  numero");
		double num = input.nextDouble();

		if (num % 2 == 0) {
			double numPar = num;
			System.out.println(par(num));
		} else {
			double numImpar = num;
			System.out.println(impar(num));
		}

	}

	public static double par(double numPar) {
		numPar = numPar * numPar;
		return numPar;

	}

	public static double impar(double numimpar) {
		numimpar = numimpar * 2;
		return numimpar;

	}

}
