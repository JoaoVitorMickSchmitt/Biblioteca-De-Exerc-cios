import java.text.DecimalFormat;
import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("qual é o valor A");
		double valorA = input.nextDouble();
		
		System.out.println("qual é o valor B");
		double valorB = input.nextDouble();
		
		System.out.println("qual é o valor C");
		double valorC = input.nextDouble();
		
		double areaDoTriangulo = (valorA * valorC) /2 ;
		System.out.println("Questão A) A área do triangulo retangulo será : "+ df.format(areaDoTriangulo));
		 
		double areaDoCirculo = (valorC * valorC) / Math.PI;
		System.out.println("b) a área do círculo de raio C será:  " +df.format(areaDoCirculo));
		
		double areaDoTrapezio = ((valorA + valorB) * valorC) /2;
		System.out.println("c) a área do trapézio é: "+df.format(areaDoTrapezio));
		
		double areaDoQuadrado = (valorB * valorB);
		System.out.println("d) a área do quadrado é: "+df.format(areaDoQuadrado));
		
		double areaDoRetangulo = (valorA * valorB);
		System.out.println("e) a área do retângulo é: "+ df.format(areaDoRetangulo));
		
	}

}
