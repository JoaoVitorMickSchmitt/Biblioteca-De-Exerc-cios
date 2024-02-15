import java.util.Scanner;

public class exer2sesenao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("qual o valor 1?");
		int numero1 = input.nextInt();

		System.out.println("qual o valor 2?");
		int numero2 = input.nextInt();

		if (numero1 % numero2 == 0) {
			System.out.println("esse numero é multiplo");

		} else {
			System.out.println("esse numero não é multiplo");
			
			
			

		}

	}

}
