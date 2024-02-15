import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {

		// Crie uma array de 5 elementos e descubra:
		// a) Qual o maior elemento
		// b) Qual o menor elemento
		// c) A média dos elementos

		Scanner input = new Scanner(System.in);

		
		double maior = Integer.MIN_VALUE;
		double menor = Integer.MAX_VALUE;
		double somaElementos = 0;
		double mediaValor = 0;
		
		int elementos[] = new int[5];
		
		for (int i = 0; i < elementos.length; i++) {

			System.out.println("insira o elemento " + (i + 1));
			elementos[i] = input.nextInt();
			somaElementos = somaElementos + elementos [i];
			
			
			if ( elementos[i] > maior) {
				maior = elementos[i];
			}	
			if ( elementos[i] < menor) {
				menor = elementos[i];
			}
				
		
			
		}
		
		
		

		for (int i = 0; i < elementos.length; i++) {
			System.out.println(" os elementos  do vetor serão " + (i + 1) + " para " + elementos[i]);
			
		}
		mediaValor = somaElementos / elementos.length;
		System.out.println("\n o maior numero será "+maior );
		System.out.println("\n o menor numero será "+menor );
		System.out.println("\n a media dos numeros será "+mediaValor);
	}

}
