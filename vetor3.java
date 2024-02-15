import java.util.Scanner;

public class vetor3 {
	//Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário entrou.
//	Imprima também o seu índice

	
	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double num = 0;
	
	
	
	
	
	System.out.println(" insira o numero ");
	num = input.nextDouble();
	
	int numeros[] = new int[5];
	numeros[0] = 1;
	numeros[1] = 2;
	numeros[2] = 3;
	numeros[3] = 4;
	numeros[4] = 5;
		
	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i] == num) {
			System.out.println(" o numero ja contem no vetor ");
			System.out.println(i);
		}
		
		
		
	}
	
	
	}
}


