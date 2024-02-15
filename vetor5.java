import java.util.Scanner;

public class vetor5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numeros[] = new int[10];

		int posicao = 0;

		System.out.println(" qual o indice voce quer que fique em 0");
		posicao = input.nextInt();

		for (int i = 0; i < 10; i++) {
			numeros[i] = 1+ i * i ;
			
			
			
		}
		numeros[posicao] = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(" os elementos  do vetor serão    para "  + numeros[i]);
		}

		
		
		
	}

}
