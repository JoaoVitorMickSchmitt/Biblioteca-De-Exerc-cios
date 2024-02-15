import java.util.Scanner;

public class exerRevisao14 {

	public static void main(String[] args) {
		
		

//Chico tem 1,50 metro e cresce 2 centímetros por ano, enquant
//o Zé tem 1,10 metros e cresce 3 centímetros por ano.
//Construa um algoritmo que calcule e imprima quantos anos serão
//necessários para que Zé seja maior que Chico.
		
		Scanner input  =  new Scanner(System.in);
		
		double zé = 1.10;
		double chico = 1.50;
		int contadoz = 0;
		while (zé < chico) {
			
		 zé += 0.03;
		contadoz++;
		chico= chico + 0.02;
			
			
		}System.out.println(" o zé demorou "+contadoz+" anos");
		
		

	}

}
