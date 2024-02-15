import java.util.Scanner;

public class exerRevisao6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	int	 vetor[] = new int[5];
	
	double maiorNumero = Integer.MIN_VALUE;
	double menorNumero = Integer.MAX_VALUE;
	double somaNumeros = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o numero do indice +" +i );
			int num = input.nextInt();
			vetor[i] = num;
			
			if (vetor[i] < menorNumero) {
				menorNumero = vetor[i];
			}
			if (vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}
			
			somaNumeros  = somaNumeros + vetor[i];
			
			
			}
		
		
	
		
		double media = somaNumeros / 5;
		System.out.println("A média sera " +media);
		System.out.println("o menor valor sera "+menorNumero);
		System.out.println("o maior valor sera "+maiorNumero);
		
		

	}

}
