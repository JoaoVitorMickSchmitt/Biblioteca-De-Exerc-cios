import java.util.Scanner;

public class exerRevisao3 {

	public static void main(String[] args) {

//		Descreva um algoritmo que v� lendo n�meros inteiros at� o usu�rio entrar com o n�mero 0
//		a) Qual � o menor valor?
//		b) Qual � o maior valor?
//		c) Qual � a m�dia dos valores?

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

		System.out.println("A m�dia sera " +media);
		System.out.println("o menor valor sera "+numeroMenor);
		System.out.println("o maior valor sera "+numerMaior);
	}

}
