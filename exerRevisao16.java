import java.util.Iterator;
import java.util.Scanner;

public class exerRevisao16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		Fa�a um algoritmo em que o usu�rio insere 
//		um n�mero em um �ndice espec�fico que ele mesmo informou
		
		int vetor[]  = new int [5];		
		
		System.out.println(" insira um indice");
		int indice = input.nextInt();
		
		for (int i = indice; i <= vetor.length; i++) {
			
			System.out.println(" agora insira um numero para esse vetor");
			vetor[i] = input.nextInt();
			break;
			
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		

	}

}
