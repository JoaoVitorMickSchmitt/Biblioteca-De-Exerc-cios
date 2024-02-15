import java.util.Scanner;

public class metodos3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			System.out.println("digite algum numero ");
			int numero = input.nextInt();
			
			
			System.out.println("os numeros a pós esse são ");
		
			numeros20(numero);
			

//Faça um programa que exiba o número que o usuário entrou e os 20 números que vem depois dele
//(O parâmetro do método deve ser o número inserido pelo usuário)

		
		
		
		
	}
	public static void numeros20(int numero) {
		
		for (int i = numero + 1; i <= 20; i++) {
			numero = i + i;
			System.out.println(i+" ");
		}
	
	}

}
