import java.util.Scanner;

public class metodosReturn9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
//      Fa�a um programa que receba 2 n�meros do usu�rio.
//		Fa�a um m�todo que descubra qual dos n�meros � maior e retorne esse valor.
//		Se os dois n�meros forem iguais, retorne: n�mero iguais.
		
		
		System.out.println(" insira o numero 1");
		double num1 = input.nextDouble();
		
		System.out.println(" insira o numero 2");
		double num2 = input.nextDouble();
		
		numMaior(num1, num2);
			System.out.println(numMaior(num1, num2));

	} public static String numMaior(double num1, double num2) {
		
		
		if (num1 > num2) {
			
		return " o numero "+num1 +" � o maior numero" ;
		}
		if (num2 > num1) {
			
		return " o numero "+num2 +" � o maior numero";
		}
		if (num1 == num2) {
		
		return " o numero "+num1 +" e  o numero "+num2  +" s�o iguais";
		}
		return " ";
		
	}
	
	
	

}
