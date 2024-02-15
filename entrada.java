import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("insira o valor 1");
		int valor1 = input.nextInt();
		System.out.println("insira o valor 2");
		int valor2 = input.nextInt();
		System.out.println("o valor das somas são:");
		System.out.println(valor1 + valor2);
		System.out.println("o valor da multiplicação É:");
		System.out.println(valor1 * valor2);
		
		
	}

}
