import java.text.DecimalFormat;
import java.util.Scanner;

public class exerRevisao1 {

	public static void main(String[] args) {
			 Scanner  input =  new Scanner(System.in);
			 DecimalFormat df = new DecimalFormat("0.0");
//			 
//			 IMC = Massa / Altura²
//
//					 Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, 
//					 de acordo com a seguinte tabela:
//
//					 < 18.5 Magreza
//					 18.5 – 24.9 Saudável
//					 25.0 – 29.9 Sobrepeso
//					 30.0 – 34.9 Obesidade Grau I
//					 35.0 – 39.9 Obesidade Grau II (severa)
//					 > 40.0 Obesidade Grau III (morbida)
			 
			 
			System.out.println(" qual o seu peso ? ");
			 double peso = input.nextDouble();
			 
			 System.out.println(" qual a sua altura");
			 double altura  = input.nextDouble();
			 
					 
			double IMC = peso / (altura * altura);
			 
			if (IMC < 18.5 ) {
				System.out.println(" voce possui Magreza .");
			}
			if (IMC > 18.5 && IMC < 24.9) {
				System.out.println(" voce possui Saudável .");
			}
			if (IMC > 25 && IMC < 29.9) {
				System.out.println(" voce possui Sobrepeso .");
			}
			if (IMC > 30 && IMC < 34.9) {
				System.out.println(" voce possui Obesidade Grau I .");
			}
			if (IMC > 35 && IMC < 39.9) {
				System.out.println(" voce possui Obesidade Grau II (severa).");
			}
			if (IMC > 40) {
				System.out.println(" voce possui Obesidade Grau III (morbida) .");
			}
		
			System.out.println("O SEU IMC É (SE PREUCUPE) "+df.format(IMC));
		
		
	}

}
