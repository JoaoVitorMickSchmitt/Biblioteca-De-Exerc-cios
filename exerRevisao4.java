import java.util.Scanner;

public class exerRevisao4 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número 
		//lido, se o mesmo é par ou ímpar.
		
		Scanner input =new Scanner(System.in);
	
		for (int i = 0; i < 5; i++) {
			
			System.out.println(" digite algum numero");
			double num = input.nextDouble();
			
			
			if ( num  % 2 == 0) {
				System.out.println("o numero " +num +"  é par");
			} else {System.out.println( "o numero " + num + " é impar");
				
			}
			
			
			
			
		}
	
		
		
	}

}
