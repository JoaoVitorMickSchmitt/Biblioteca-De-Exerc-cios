import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class metodos4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Fa�a um programa que inverta os valores de duas vari�veis
//
//		Por exemplo:
//
//		int a = 5;
//		int b = 2;
//
//		Dever� ser:
//		a == 2;
//		b == 5;
//
//		� permitido criar somente uma vari�vel dentro do m�todo
//		(Fazer esse m�todo funcionar para qualquer valor inserido, al�m de qualquer tipo de vari�vel inserido).

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
