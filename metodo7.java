
import java.util.Scanner;

public class metodo7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" insira o numero (BASE)");
		double numBase = input.nextDouble();

		System.out.println(" agora insira o valor 1 ");
		double numPer1 = input.nextDouble();

		System.out.println(" agora insira o valor 2 ");
		double numPer2 = input.nextDouble();

		numBase1(numBase, numPer1, numPer2);

	}

	public static void numBase1(double numBase1, double numPer1, double numPer2) {

		double numFim1 = numBase1 - numPer1;

		double numFim2 = numBase1 - numPer2;

		double numPerto = 0;
		
		if (numFim1 < numFim2 && numFim1 > 0 ||numFim1 > numFim2 && numFim1 < 0 ) {
			numPerto = numPer1;
		}else {
			numPerto = numPer2;
		}
		System.out.println(" o numer mais perto é " + numPerto);

	}

}
