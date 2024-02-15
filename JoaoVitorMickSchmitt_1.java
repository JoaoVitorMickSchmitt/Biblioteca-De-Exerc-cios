import java.text.DecimalFormat;
import java.util.Scanner;

public class JoaoVitorMickSchmitt_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("quanto de dinheiro voce tem : ");
		double valor = input.nextDouble();
		
		System.out.println("Qual é a operação que voce quer fazer com esse dinheiro.\n 1- converter de dolar para real  \n 2- converter de real para dolar");
	int opera = input.nextInt();
		
	
	if (opera > 2  || opera < 1  ) {
		System.out.println("Ops, parece que você não está prestando atenção. \nReinicie o programa e solicite a operação correta. ");
	}
		
		
		switch (opera) {
		
		case 1: 
			 valor = (valor * 4.89);
			System.out.println("O seu valor final em reais será: R$"+df.format(valor));
			break;
			
		case 2: 
			 valor = (valor / 4.89);
			System.out.println("O seu valor final em dolares será: $"+df.format(valor));
			break;
		
		

	}	

}
}
