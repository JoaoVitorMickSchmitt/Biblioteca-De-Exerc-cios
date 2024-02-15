import java.util.Scanner;

public class exerRevisao8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		

//Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice.
//Ex:
//[0] = 0
//[1] = 1
//[2] = 4
//[3] = 9
//[4] = 16
//
//Faça com que a array tenha 100 elementos.
		
		int	 vetor[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			vetor[i] = i * i;
			
			}
		
		
		
		
		
		
			System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print(vetor[i]+ ", ");

			}
		System.out.println("]");
		
		
		
	}

}
