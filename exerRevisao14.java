import java.util.Scanner;

public class exerRevisao14 {

	public static void main(String[] args) {
		
		

//Chico tem 1,50 metro e cresce 2 cent�metros por ano, enquant
//o Z� tem 1,10 metros e cresce 3 cent�metros por ano.
//Construa um algoritmo que calcule e imprima quantos anos ser�o
//necess�rios para que Z� seja maior que Chico.
		
		Scanner input  =  new Scanner(System.in);
		
		double z� = 1.10;
		double chico = 1.50;
		int contadoz = 0;
		while (z� < chico) {
			
		 z� += 0.03;
		contadoz++;
		chico= chico + 0.02;
			
			
		}System.out.println(" o z� demorou "+contadoz+" anos");
		
		

	}

}
