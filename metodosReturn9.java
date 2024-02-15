import java.util.Scanner;

public class metodosReturn9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
//      Faça um programa que receba 2 números do usuário.
//		Faça um método que descubra qual dos números é maior e retorne esse valor.
//		Se os dois números forem iguais, retorne: número iguais.
		
		
		System.out.println(" insira o numero 1");
		double num1 = input.nextDouble();
		
		System.out.println(" insira o numero 2");
		double num2 = input.nextDouble();
		
		numMaior(num1, num2);
			System.out.println(numMaior(num1, num2));

	} public static String numMaior(double num1, double num2) {
		
		
		if (num1 > num2) {
			
		return " o numero "+num1 +" é o maior numero" ;
		}
		if (num2 > num1) {
			
		return " o numero "+num2 +" é o maior numero";
		}
		if (num1 == num2) {
		
		return " o numero "+num1 +" e  o numero "+num2  +" são iguais";
		}
		return " ";
		
	}
	
	
	

}
