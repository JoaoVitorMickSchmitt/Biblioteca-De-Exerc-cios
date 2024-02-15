import java.text.DecimalFormat;
import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
			System.out.println("qual o nome do vendedor ");
			String nomeVendedor = input.next();
			System.out.println("Qual o salario fixo dele? ");
			double salarioFixo = input.nextInt();
			System.out.println("Quantass vendas ele fez ");
			double vendas = input.nextInt();
			
			double valorTotal = salarioFixo + (vendas * 0.15);
			System.out.println("ele vai receber no mês; "+df.format(valorTotal));
			
	}

}
