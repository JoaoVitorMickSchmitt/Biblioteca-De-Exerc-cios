import java.util.Scanner;

public class metodosReturn6 {

	public static void main(String[] args) {

//Fa�a um programa que receba 3 notas do usu�rio e informe a m�dia dessas notas.
//
//Retorne a m�dia

	Scanner input = new Scanner(System.in);
	
	System.out.println(" insira o valor da 1 nota");
	double nota1 =input.nextDouble();

	System.out.println(" insira o valor da 2 nota");
	double nota2 =input.nextDouble();
	
	System.out.println(" insira o valor da 3 nota");
	double nota3 =input.nextDouble();
	
	System.out.println(" a media sera " +media(nota1, nota2, nota3));
	
	
	}
	private static double  media(double nota1, double nota2, double nota3) {
		
		double media = (nota1+ nota2+ nota3) / 3;
		return media;
		
	}
	
	
	
	
	

}