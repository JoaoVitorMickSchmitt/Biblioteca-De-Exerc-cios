import java.text.DecimalFormat;
import java.util.Scanner;

public class exer14sesenao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Qual é sua massa em Kg? ");
		double massa = input.nextDouble();
		
		System.out.println("Qual é sua altura em metros? ");
		double altura = input.nextDouble();
		
		double imc = massa / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: magreza" );
		}
		if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: saudável" );
		}
		if (imc >= 25 && imc <= 29.9) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: sobrepeso" );
		}
		if (imc >= 30 && imc <= 34.9) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: obesidade Grau I" );
		}
		if (imc >= 35 && imc <= 39.9) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: obesidade Grau II (severa)" );
		}
		if (imc >= 40) {
			System.out.println("Seu imc é: " + imc + "e você está na situação: obesidade Grau III (morbida)" );
		}
	}

}