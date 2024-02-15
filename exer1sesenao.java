import java.util.Scanner;

public class exer1sesenao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("qual o valor 1?");
		int numero1 = input.nextInt();
		
		System.out.println("qual o valor 2?");
		int numero2 = input.nextInt();
		
		if (numero1 > numero2) {System.out.println("o numero 1 é maior");
			
		} else {System.out.println("o numero 2 é maior");

		}
		
		
		
	}

}
