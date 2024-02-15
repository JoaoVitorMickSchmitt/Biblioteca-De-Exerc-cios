import java.util.Scanner;

/**
 * @author jvmschmitt
 *
 */
public class vetor11 {
 
	
	
//	Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos.
//	Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições 
//	respectivas dos vetores originais.
//	Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
//	Exiba, ao final, os três vetores na tela.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int vetor1[] = new int [10];
		
		
		System.out.println("os valores do vetor 1 são : ");
		System.out.print("[");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i]  = (i + i);
			System.out.print(+vetor1[i]+ ", ");
		}
		
		System.out.print("]");
		System.out.println("\n \n os valores do vetor 2 são: ");
		System.out.print("[");
		int vetor2[] = new int [10];	
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = i * i;
			System.out.print(+vetor2[i]+", ");
		}
		System.out.print("]");
		System.out.println(" \n \n os valores do vetor 3 são:");
		System.out.print("[");
		int vetor3[] = new int [10];
		for (int i = 0; i < vetor3.length; i++) {
			 vetor3[i] = ( vetor2[i] +  vetor1[i] );
			 System.out.print(+vetor3[i]+", ");
		}
		System.out.print("]");
		
		
		
		
	
		
		
	}

}
