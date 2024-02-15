import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("de o valor de raio");
		int raio = input.nextInt(); 
		System.out.println("a area será: "); 
		System.out.println(raio * raio * Math.PI);		
		
	}

}
