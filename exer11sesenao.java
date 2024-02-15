import java.util.Scanner;

public class exer11sesenao {

	public static void main(String[] args) {
		//Escreva um algoritmo em que o usuário entra com um número.
		//Depois ele escolhe a operação que vai ser feita com esse número
		//Caso ele escolha a operação 1
		//Modifique a variável do número entrado e some 10 ao número original
		//Caso ele escolha a operação 2
		//Modifique a variável do número entrado e subtraia 10 do número original
		//Caso ele escolha a operação 3
		//Modifique a variável do número entrado e multiplique 10 ao número original
		//Caso ele escolha a operação 4
		//Modifique a variável do número entrado e divida 10 do número original
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual o numero que voce vai insirir ");
		
		int numero1 = input.nextInt();
		
		System.out.println("qual operação voce vai usar ?  (1 2 3  e  4 ) ");
		
		int operacao = input.nextInt();
		
		int resultado = 0;
		
		if (operacao == 1) { 
			resultado = numero1 + 10;
		} else if (operacao ==2 ) {
			resultado = numero1 - 10;
		} else if (operacao == 3) {
			resultado = numero1 * 10;
		} else if (operacao == 4) {
			resultado = numero1 / 10;
		}
		
		 System.out.println("o numero final  será "+ resultado );
				
			
		
		
		
		
	}

}
