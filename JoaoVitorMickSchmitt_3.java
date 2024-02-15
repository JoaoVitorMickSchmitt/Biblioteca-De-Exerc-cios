import java.text.DecimalFormat;
import java.util.Scanner;

public class JoaoVitorMickSchmitt_3 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input  = new Scanner(System.in);

		double somaAltura = 0;
		int contador = 0;
		double altura = 0;
		
		
		for (int i = 0; i < 10; i++) {
			contador++;
			
			
			
			
			
	
		
		System.out.println("Qual é a altura da pessoa?");
		 altura = input.nextDouble();
			
		 somaAltura = somaAltura + altura;
		}
		
		double media = somaAltura / contador  ;
		System.out.println("A média das alturas é: " + df.format(media));
		
		

	}

}
