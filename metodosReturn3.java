import java.util.Scanner;

public class metodosReturn3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
//		Fa�a um m�todo booleano que retorne true se o n�mero passado como par�metro seja par.
//		Retorno false caso seja impar.
		
		System.out.println(" insira um valor ser for true ele � par e se for false ele � impar");
		double num = input.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println(par(num));
		}else {
			System.out.println(impar(num));
		}
		
		
		
	}public static boolean par(double num) {
			
			
			return true;
		
		
		
	}
		public static boolean impar(double num) {
	
	
	return false;



}
	

}
