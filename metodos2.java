import java.util.Scanner;

public class metodos2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Faça um método para cada um dos seus seus colegas
//		O método deve imprimir:
//		O nome dele(a) é [nome]
//		Ele(a) tem [idade] anos
//		Ele(a) é estudante do Entra 21
//		(Em prints separados)
//
//		Faça com que o método tenha o nome do seu colega.
//
//		O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser executado.
		
		
		
		System.out.println(" entre com o nome dos seu colega       / insira a palavra fim para encerrar o código");
		String nome = input.next();
			
		
			
		while (!nome.equals("fim")) {
		
			if (nome == "Gustavo") {
				Gustavo();
			}else if (nome.equals("André")) {
				André();
			}else if (nome == "Miguel") {
				Miguel();
			}
			
			
			else {
				System.out.println(" insira o nome com letra inicial maiúscula"
						+ " e/ou com um nome de um amigo insirido / (André , Miguel, Gustavo) ");
			}
	
			System.out.println(" entre com o nome dos seu colega  / insira a palavra fim para encerrar o código");
			 nome = input.next();
			
		}
		System.out.println(" programa encerrado");
				
				
	}
	public static void Gustavo() {
		System.out.println("\nO nome dele(a) é [Gustavo]\r\n"
				+ "//Ele(a) tem [17] anos\r\n"
				+ "//Ele(a) é estudante do Entra 21\r\n");
		
	}
	public static void André() {
		System.out.println("\nO nome dele(a) é [André]\r\n"
				+ "// Ele(a) tem [17] anos\r\n"
				+ "// Ele(a) não é  estudante do Entra 21\r\n");
					
	}
	public static void Miguel() {
		System.out.println("O nome dele(a) é [Miguel]\r\n"
				+ "//		Ele(a) tem [16] anos\r\n"
				+ "//		Ele(a) não é estudante do Entra 21\r\n");
		
	}

}
