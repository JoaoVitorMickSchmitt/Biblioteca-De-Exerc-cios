import java.util.Scanner;

public class metodos2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Fa�a um m�todo para cada um dos seus seus colegas
//		O m�todo deve imprimir:
//		O nome dele(a) � [nome]
//		Ele(a) tem [idade] anos
//		Ele(a) � estudante do Entra 21
//		(Em prints separados)
//
//		Fa�a com que o m�todo tenha o nome do seu colega.
//
//		O usu�rio deve entrar com o nome da pessoa para escolher um dos m�todos a ser executado.
		
		
		
		System.out.println(" entre com o nome dos seu colega       / insira a palavra fim para encerrar o c�digo");
		String nome = input.next();
			
		
			
		while (!nome.equals("fim")) {
		
			if (nome == "Gustavo") {
				Gustavo();
			}else if (nome.equals("Andr�")) {
				Andr�();
			}else if (nome == "Miguel") {
				Miguel();
			}
			
			
			else {
				System.out.println(" insira o nome com letra inicial mai�scula"
						+ " e/ou com um nome de um amigo insirido / (Andr� , Miguel, Gustavo) ");
			}
	
			System.out.println(" entre com o nome dos seu colega  / insira a palavra fim para encerrar o c�digo");
			 nome = input.next();
			
		}
		System.out.println(" programa encerrado");
				
				
	}
	public static void Gustavo() {
		System.out.println("\nO nome dele(a) � [Gustavo]\r\n"
				+ "//Ele(a) tem [17] anos\r\n"
				+ "//Ele(a) � estudante do Entra 21\r\n");
		
	}
	public static void Andr�() {
		System.out.println("\nO nome dele(a) � [Andr�]\r\n"
				+ "// Ele(a) tem [17] anos\r\n"
				+ "// Ele(a) n�o �  estudante do Entra 21\r\n");
					
	}
	public static void Miguel() {
		System.out.println("O nome dele(a) � [Miguel]\r\n"
				+ "//		Ele(a) tem [16] anos\r\n"
				+ "//		Ele(a) n�o � estudante do Entra 21\r\n");
		
	}

}
