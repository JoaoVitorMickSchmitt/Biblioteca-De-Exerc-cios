import java.util.Scanner;

public class metodosReturn8 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
//		Fa�a um programa que diz se um n�mero inserido est� dentro de um limite imposto pelo usu�rio
//
//		Por exemplo:
//
//		Usu�rio inseriu o limite m�ximo como 100.
//		Usu�rio inseriu o limite m�nimo como 70.
//
//		Depois ele inseriu o n�mero 80.
//		O retorno deve ser: 80 est� nos limites impostos.
		
		System.out.println(" insira um limite maximo para o imposto");
		double numMax =input.nextDouble();
		
		System.out.println(" agora insira um valor m�nimo ");
		double numMIn = input.nextDouble();
		
		
	System.out.println(" certo, agora insira o valor que voce quer ");		
	double num = input.nextDouble();
	
	limite( num, numMIn, numMax);
			
	System.out.println(limite(num, numMIn, numMax));
	

	}public static String limite(double num, double numMIn, double numMax) {
		
		if (num  < numMax && num > numMIn) {
			
			return num + " est� no limite imposto";
		}
		
		return "o numero "+ num+" n�o est� no limite imposto";
		
	}
	
	

}
