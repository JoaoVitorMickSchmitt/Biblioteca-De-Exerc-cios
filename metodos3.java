import java.util.Scanner;

public class metodos3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			System.out.println("digite algum numero ");
			int numero = input.nextInt();
			
			
			System.out.println("os numeros a p�s esse s�o ");
		
			numeros20(numero);
			

//Fa�a um programa que exiba o n�mero que o usu�rio entrou e os 20 n�meros que vem depois dele
//(O par�metro do m�todo deve ser o n�mero inserido pelo usu�rio)

		
		
		
		
	}
	public static void numeros20(int numero) {
		
		for (int i = numero + 1; i <= 20; i++) {
			numero = i + i;
			System.out.println(i+" ");
		}
	
	}

}
