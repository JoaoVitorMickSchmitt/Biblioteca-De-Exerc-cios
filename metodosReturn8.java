import java.util.Scanner;

public class metodosReturn8 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
//		Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário
//
//		Por exemplo:
//
//		Usuário inseriu o limite máximo como 100.
//		Usuário inseriu o limite mínimo como 70.
//
//		Depois ele inseriu o número 80.
//		O retorno deve ser: 80 está nos limites impostos.
		
		System.out.println(" insira um limite maximo para o imposto");
		double numMax =input.nextDouble();
		
		System.out.println(" agora insira um valor mínimo ");
		double numMIn = input.nextDouble();
		
		
	System.out.println(" certo, agora insira o valor que voce quer ");		
	double num = input.nextDouble();
	
	limite( num, numMIn, numMax);
			
	System.out.println(limite(num, numMIn, numMax));
	

	}public static String limite(double num, double numMIn, double numMax) {
		
		if (num  < numMax && num > numMIn) {
			
			return num + " está no limite imposto";
		}
		
		return "o numero "+ num+" não está no limite imposto";
		
	}
	
	

}
