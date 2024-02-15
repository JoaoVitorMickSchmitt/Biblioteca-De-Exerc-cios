import java.util.Scanner;

public class exerRevisao12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double massaFinal =0;
		//Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
		//Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário 
		//para que essa massa se torne menor que 0,5 gramas.
		//Escreva a massa inicial, a massa final e o tempo.
		
		int contador50 = 0;
		System.out.println(" inisra o o peso em kg da massa radiativa");
		double massaKg = input.nextDouble();
		
		for (double i = massaKg; i > 0.5; ) {
			i =  i/2;
			contador50++;
		 massaFinal = i;
		 }
		
		double segundos = contador50 * 50;
		System.out.println(" a massa inicial será "+massaKg
					+" a massa final será " +massaFinal
					+" demoraram "+segundos+" segundos");
		
		
		
		

	}

}
