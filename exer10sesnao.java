import java.util.Scanner;

public class exer10sesnao {

	public static void main(String[] args) {
		
	 Scanner input =new Scanner(System.in);
	 System.out.println("digite os  2 numeros que voce quer usar na operação ");
	 int numero1 = input.nextInt();
	 int numero2 = input.nextInt();
	 
	 System.out.println("agora digite  a operação que voce quer usar "
	 		+ "Caso 1: some os dois números.\r\n"
	 		+ "Caso seja 2: subtraia os dois números.\r\n"
	 		+ "Caso seja 3: multiplique os dois números.\r\n"
	 		+ "Caso seja 4: divida os dois números.	");
	 
	 int caso = input.nextInt();
	 int resultado = 0;
	 
	 if (caso == 1 ) {
		 resultado = numero1 + numero2;
	 }
	 else if (caso == 2) {
			resultado = numero1 - numero2;
			 
		 }
		 
	 else if (caso == 3 ) {
			 resultado = numero1 * numero2;
		 }
			 
	 else if (caso == 4 ) {
			 resultado = numero1 / numero2;
		 }
		 
	System.out.println(" o resultado da sua opera��o �  "+resultado+ " que questão irritante");

	
	
	
	
	
	}
	 
	
	 
	 
	 
	}


