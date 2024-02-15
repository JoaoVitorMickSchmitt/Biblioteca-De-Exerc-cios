import java.util.Scanner;

public class vetor7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int  numeros[] = new int [10];
		
		System.out.println(" tabela original \n"
				+ "");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			
			System.out.println( +numeros[i]);

		}
		
		System.out.println(" \n  tabela reversa \n");
		
		for (int i = numeros.length - 1; i >=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}
}