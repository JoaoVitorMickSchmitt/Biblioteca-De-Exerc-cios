import java.util.Scanner;

public class desafioAscii {

	public static void main(String[] args) {

//		Nesta desafio iremos implementar o algoritmo de cifragem denominado de “Cifra de César”.
//
//		A Cifra de César encripta uma mensagem trocando os caracteres 3, e somente 3, posições à sua frente.
//		Então a palavra CESAR vai ser tornar FHVDU, a palavra COMPUTADOR se tornará FRPSXWDGRU
//
//		Construa um programa que possibilite ao usuário cifrar algum texto e decifrar algum texto utilizando este algoritmo.
//		Isto é, o programa deve permitir que o usuário acione estas funcionalidades:
//		Cifrar um texto e decifrar um texto.
//
//		A Cifra de César limita-se a cifrar apenas caracteres constituídos de letras do alfabeto.
//		Espaços, números e outros caracteres não compõe o texto simples. Não usar caracteres especiais como é, ã, etc.
//
//		Se atente às letras maiúsculas e minúsculas!
//
//		Use a função nextLine() em vez da next() para poder colocar mais palavras na entrada do Scanner.
		
		
	
		Scanner input = new Scanner(System.in);
		
		
		char cdzxjcoizxj = 'a'; 
		char ch2 = 'b';  
		int asciivalue1 = cdzxjcoizxj;  
		int asciivalue2 = ch2;  
		
		
		System.out.println("escreva uma frase :");
		String frase = input.nextLine();
		
		System.out.println("qual opcçao voce precisa d = decifrar / c = cifrar :");
		char opcao= input.next().charAt(0);
		
		 String vetor[] = new String [frase.length()];
		if (opcao == 'c') {
			for (int i = 0; i < vetor.length; i++) {
				char cifrar = frase.charAt(i);
				
				int fraseCi = cifrar + 3;
				char cifrar3  = (char) fraseCi;
				
				if (cifrar3 == '}') {
					cifrar3 = 'c';
				}
				if (cifrar3 == '|') {
					cifrar3 = 'b';
				}
				if (cifrar3 == '{') {
					cifrar3 = 'a';
				}
				if (cifrar3 == '#') {
					fraseCi  = cifrar - 3;
					char cifrar33  = (char) fraseCi;
					cifrar3 = cifrar33;
				}
				if (cifrar3 == 'C') {
					cifrar3 = '@';
					
				}
				
				System.out.print(cifrar3+" ");
				
				
				
			}
		}
		if (opcao == 'd') {
			for (int i = 0; i < vetor.length; i++) {
				char cifrar = frase.charAt(i);
				
			
					
				
				int fraseD = cifrar - 3;
				char Decifrar3  = (char) fraseD;
				
				if (Decifrar3 == '^') {
					Decifrar3 = 'x';
				}
				if (Decifrar3 == '_') {
					Decifrar3 = 'y';
				}
				if (Decifrar3 == '`') {
			
					Decifrar3 = 'z';
				}
				if (Decifrar3 == '#') {
					fraseD  = cifrar - 3;
					char cifrar33  = (char) fraseD;
					Decifrar3 = cifrar33;
				}
				if (Decifrar3 == '=') {
					Decifrar3 = '@';
					
				}
				
				
				System.out.print(Decifrar3+" ");
			}
			
		}
	
		
		
		
	}

}
