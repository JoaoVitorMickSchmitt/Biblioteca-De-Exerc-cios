import java.util.Iterator;
import java.util.Scanner;

public class metodosReturn11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
//Fa�a um c�digo que recebe uma palavra do usu�rio, se essa palavra tem tamanho par, retorne o primeiro caracter dessa palavra.
//Caso ela tenha tamanho �mpar, retorne o segundo caracter dessa palavra.
		
		System.out.println(" insira uma palavra");
		String palavra = input.next();
		
		System.out.println(saidaPalavra(palavra));
		
		
		
		
	}private static char saidaPalavra( String palavra) {
		
		
	
		
			
	
			if (palavra.length() % 2 ==0) {
					
				return palavra.charAt(0)  ;
		}
		return palavra.charAt(1);
			
	}

}
