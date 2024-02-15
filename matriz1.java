import java.util.Scanner;

public class matriz1 {

//	Crie uma matriz com 12 linhas e 2 colunas
//	A primeira coluna corresponde aos meses do ano
//	A segunda corresponde ao lucro que a loja teve no mês.
//	Imprima o seu resultado no formato:
//	No mês 1 a loja teve 2000 de lucro
//	No mês 2 a loja teve 1500 de lucro...
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int [12][2];
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz[i][0] = i + 1;
			
			
			System.out.println(" quanto de lucro a empresa teve no "+(i+1)+ " mes? ");
			 matriz[i][1] = input.nextInt();
			 
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" no mes mes "+matriz[i][0] + " teve "+matriz[i][1] );
		}
		
		
		
		
		
		
		
		
		
	}
}