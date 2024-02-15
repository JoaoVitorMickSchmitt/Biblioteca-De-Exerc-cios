import java.util.Scanner;

public class exerRevisao5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		Crie uma array de 5 elementos e imprima os últimos elementos por primeiro.
		
		
	int	 vetor[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o numero do indice +" +i );
			int num = input.nextInt();
			vetor[i] = num;
			

			}
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]+ " ");

			}
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" \n digite o numero do indice +" +i );
			int num = input.nextInt();
			vetor[i] = num;
			

			}
		
		
		for (int i = vetor.length -1; i >= 0 ; i--) {
			
			System.out.print(vetor[i]+ " ");

			}
		
		
		
		
		
		
		
		
	}

}
