import java.util.Scanner;

public class exer9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual a distancia do trajeto em Km?");
		double trajeto = input.nextDouble();
		
	
	
		double minutos = (2 * trajeto);
		System.out.println("o tempo para o carro y tomar essa distancia é " + minutos);
		
	
	}
	

}
