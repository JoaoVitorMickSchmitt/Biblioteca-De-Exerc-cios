import java.util.Scanner;

public class metodosReturn5 {

	public static void main(String[] args) {
		Scanner input  =new Scanner(System.in);
		
//		Fa�a um m�todo que calcule o per�metro e outro que calcule a �rea de um ret�ngulo.
//
//		Retornar os valores calculados

		System.out.println("o valor da altura");
		double A = input.nextDouble();
		
		System.out.println("o valor da base");
		double B = input.nextDouble();
		
	System.out.println(" o perimetro ser� "+perimetro(A, B));
		System.out.println("a area ser�"+ area(A, B));
		
		
	} public static double area(double A, double B) {
		
		double area = A*B;
		return area;
		
	}
	 
		public static double perimetro (double A, double B) {
			
			double perimetro = (A+A) + (B+B);
			return perimetro;
			
		}
	

}
