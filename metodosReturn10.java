import java.util.Scanner;

public class metodosReturn10 {

	public static void main(String[] args) {
		
//		Faça um programa que receba um número, esse será o número "base"
//		Depois faça o usuário entrar com mais dois números
//		Retorne qual dos dois últimos números está mais perto do primeiro número "base"
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println(" insira o numero base");
		double numBase = input.nextDouble();
		
		System.out.println(" insira o numero 1");
		double num1 = input.nextDouble();
		System.out.println(" insira o numero 2");
		double num2 = input.nextDouble();
		
		
		System.out.println(maiorMenor(numBase, num1, num2));
		
	}public static double maiorMenor( double numBase, double num1, double num2) {
		
		double totalNum1 = numBase - num1;
		double totalNum2 = numBase - num2;
		
		if (totalNum1 > 0 && totalNum1 < totalNum2 || totalNum2 < 0 && totalNum1 >totalNum2) {

			return num1;
		}
		return num2;
		
	}
	
	

}
