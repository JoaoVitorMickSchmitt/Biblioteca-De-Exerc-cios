import java.util.Scanner;

public class metodoReturn2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//
//		Faça um método que receba 4 números como parâmetros, some os 4 números.
//
//		Retorne a soma
		
		
		
		System.out.println(" insira o 1 valor");
		double num1 = input.nextDouble();
		
		System.out.println(" insira o 2 valor");
		double num2 = input.nextDouble();
		
		System.out.println(" insira o 3 valor");
		double num3 = input.nextDouble();
		
		System.out.println(" insira o 4 valor");
		double num4 = input.nextDouble();
		
		System.out.println(somaNumeros(num1, num2, num3, num4));
		
		

	}
	public static double somaNumeros(double num1,double num2,double num3,double num4 ) {
		double soma = num1 +num2 + num3+ num4;
		return soma;
		
	}
	
			
			

}
