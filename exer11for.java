import java.util.Iterator;
import java.util.Scanner;

public class exer11for {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		System.out.println("escreva o numero para calcular o fatorial");
		double numeroFator = input.nextDouble();
		
		double f = numeroFator;
		
		while (numeroFator > 1 ) {
			f = f *(numeroFator-1);
			 numeroFator--;
		}
		
		


		
		
		System.out.println("o resultado sera "+f );
	}

}


		