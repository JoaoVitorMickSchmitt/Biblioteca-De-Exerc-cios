import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("escreva o valor A : ");
		int valorA = input.nextInt(); 
		System.out.println("escreva o valor B : ");
		int valorB = input.nextInt();
		System.out.println("escreva o valor C : ");
		int valorC = input.nextInt();
		System.out.println("escreva o valor D : ");
		int valorD = input.nextInt();
		int produtoAB =valorA * valorB;
		int produtoCD =valorC * valorD;
		int diferenca = produtoAB - produtoCD;
		System.out.println(" a diferenca do produto A e B e C e D é "+ diferenca);
	}
}
