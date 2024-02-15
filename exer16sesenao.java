import java.text.DecimalFormat;
import java.util.Scanner;

public class exer16sesenao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("quanto tempo voce esta na empresa");
		int mes = input.nextInt();

		System.out.println("quanto dinheiro voce recebe ");
		int dinheiro = input.nextInt();

		double reajuste = 0;

		if (mes < 12) {
			reajuste = (dinheiro * 0.05);
			System.out.println("voce teve um reajuste de " + reajuste + " reais");

		} else if (mes > 12 && mes <= 48) {
			reajuste = (dinheiro * 0.07);
			System.out.println("voce teve um reajuste de " + reajuste + " reais");

		}

	}

}
