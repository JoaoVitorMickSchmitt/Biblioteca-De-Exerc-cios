import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class JoaoVitorMickSchmitt1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
	int numeroMaior = 0;
		int vetor[] = new int [6]; 
		
//		Crie um programa para encontrar o maior número que pode ser criado reordenando 
//		um vetor de 6 posições. 
//		Por exemplo: 
//		{1, 2, 3, 0, 4, 6} 
//		Deverá ter a saída: 643210 
//		Proibido usar: Arrays.sort() 
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" insira um numero para o "+ i +" indice");
			vetor[i] = input.nextInt();
				
			if (vetor[i] > vetor[i]) {
				 numeroMaior = vetor[i]; 
				 vetor[0] =numeroMaior ;
			}
		
			
			
		}
		for (int i = 0; i < vetor.length ; i++) {
			System.out.println(vetor[i]);
		}
		
	
		
	}

}
