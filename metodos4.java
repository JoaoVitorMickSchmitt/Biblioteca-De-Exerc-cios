import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class metodos4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Faça um programa que inverta os valores de duas variáveis
//
//		Por exemplo:
//
//		int a = 5;
//		int b = 2;
//
//		Deverá ser:
//		a == 2;
//		b == 5;
//
//		É permitido criar somente uma variável dentro do método
//		(Fazer esse método funcionar para qualquer valor inserido, além de qualquer tipo de variável inserido).

		System.out.println(" insira o numero da variavel (a)");
		double A = input.nextDouble();
		System.out.println(" insira o numero da variavel (b)");
		double B = input.nextDouble();
		
		transformar(A, B);
	}
	public static void transformar(double numeroA, double numeroB) {
		
		double numeroC = 0;
		
		
		numeroC  = numeroA;
		numeroA = numeroB;
		
		System.out.println("A = "+ numeroB);
		System.out.println("B = "+ numeroC);
	}

}
