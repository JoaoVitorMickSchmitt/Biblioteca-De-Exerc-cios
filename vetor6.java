import java.util.Scanner;

public class vetor6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int  numeros[] = new int [10];
		
		System.out.println("escolha o numero em algum indice para a mudança");
		int mudanca = input.nextInt();
		
		System.out.println("agora, escolha o numero da mundança ");
		int num = input.nextInt();
		for (int i = 0; i < 10; i++) {
			numeros[i] = 1+ i * i ;
						
		}	numeros[mudanca] = num;
		 
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(" os elementos  do vetor serão    para "  + numeros[i]);
		}

		
		
		

	}

}
