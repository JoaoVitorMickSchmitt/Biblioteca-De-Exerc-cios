
import java.util.Scanner;
public class metodos8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" insira um valor para calcular o seu cubo");
		double num1 = input.nextDouble();
		
		System.out.println(" insira o segundo valor para calcular o seu cubo");
		double num2 = input.nextDouble();
		
	
		cubo(num1, num2);
		
	
	}public static void cubo(double num1, double num2) {
		if (num1 == 5 || num2 == 5 || num1 - num2 == 5 || num2 - num1 == 5 || num1 + num2 ==5 ||num2 + num1 ==5 ) {
			System.out.println("os cubos são");
		num1 = num1 * num1 * num1;
		num2 = num2 * num2 * num2;	
		}else {
			num1 = num1 *num1 ;
			num2 = num2 * num2;
		}
		
		System.out.println("o resultado final será ");
			System.out.print("numero1 \n "+num1+"\n");
			System.out.print("numero2 \n "+num2);
		
	}
}

