import java.util.Scanner;

public class desafioAscii {

	public static void main(String[] args) {

//		Nesta desafio iremos implementar o algoritmo de cifragem denominado de �Cifra de C�sar�.
//
//		A Cifra de C�sar encripta uma mensagem trocando os caracteres 3, e somente 3, posi��es � sua frente.
//		Ent�o a palavra CESAR vai ser tornar FHVDU, a palavra COMPUTADOR se tornar� FRPSXWDGRU
//
//		Construa um programa que possibilite ao usu�rio cifrar algum texto e decifrar algum texto utilizando este algoritmo.
//		Isto �, o programa deve permitir que o usu�rio acione estas funcionalidades:
//		Cifrar um texto e decifrar um texto.
//
//		A Cifra de C�sar limita-se a cifrar apenas caracteres constitu�dos de letras do alfabeto.
//		Espa�os, n�meros e outros caracteres n�o comp�e o texto simples. N�o usar caracteres especiais como �, �, etc.
//
//		Se atente �s letras mai�sculas e min�sculas!
//
//		Use a fun��o nextLine() em vez da next() para poder colocar mais palavras na entrada do Scanner.
		
		
	
		Scanner input = new Scanner(System.in);
		
		
		char cdzxjcoizxj = 'a'; 
		char ch2 = 'b';  
		int asciivalue1 = cdzxjcoizxj;  
		int asciivalue2 = ch2;  
		
		
		System.out.println("escreva uma frase :");
		String frase = input.nextLine();
		
		System.out.println("qual opc�ao voce precisa d = decifrar / c = cifrar :");
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
