import java.util.Scanner;

public class exerRevisao7 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			

//Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário entrou.
//Printe também o seu índice.
	

		
			
			
			
			int	 vetor[] = new int[5];
			
			for (int i = 0; i < 5; i++) {
				vetor[i] = i + i  *2;
				
				}
			
			System.out.println(" insira um valor");
			int numero = input.nextInt();
			
			boolean existente = false;
			for (int i = 0; i < vetor.length; i++) {
				
					
				if (numero == vetor[i]) {
						
						System.out.println(" esse valor já existe no vetor " + numero);
						existente = true;
						break;
					} 
					
				
			}
			if (existente == false ){
				System.out.println(" nao tem");
				
			
			}
			
			
			
			for (int i = 0; i < vetor.length; i++) {
				
				System.out.print(vetor[i]+ " ");

				}
			
		
		
		

	}

}
