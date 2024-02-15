import java.util.Scanner;

public class exerRevisao3 {

	public static void main(String[] args) {

//		Descreva um algoritmo que vá lendo números inteiros até o usuário entrar com o número 0
//		a) Qual é o menor valor?
//		b) Qual é o maior valor?
//		c) Qual é a média dos valores?

		Scanner  input =  new Scanner(System.in);
		
		System.out.println(" entre com um numero ");
		double numero = input.nextDouble();
	
		double somaNumeros = 0;
		int contador = 0;
		double numerMaior = Integer.MIN_VALUE;
		double numeroMenor = Integer.MAX_VALUE;
		while ( numero  != 0 ) {
			contador++;
			
				if ( numero  < numeroMenor) {
					numeroMenor =  numero ; 
				}
				if ( numero  > numerMaior) {
					numeroMenor =  numero ; 
				}
				somaNumeros =  numero +somaNumeros ; 
			
			System.out.println(" entre com um numero ");
			numero = input.nextDouble();
			
		}
		double media = somaNumeros / contador;

		System.out.println("A média sera " +media);
		System.out.println("o menor valor sera "+numeroMenor);
		System.out.println("o maior valor sera "+numerMaior);
	}

}
