import java.util.Scanner;

public class metodoRetorno1 {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
//				Fa�a um programa em que o usu�rio entre com um n�mero de 1 a 4
//				Com o n�mero 1 sendo ver�o, 2 sendo outono...
//				Dependendo de o que o usu�rio informa, imprima:
		//
//				� ver�o
//				E o tempo est� quente
		//
//				Ou
		//
//				� inverno
//				E est� frio
		//
//				Fa�a um m�todo para cada esta��o do ano

				System.out.println("entre com o numero 1 - verao / 2 outono/ 3 -inverno / 4 - primavera");
				int num = input.nextInt();

				if (num == 1) {
					
					System.out.println(Entrada());
				}
				if (num == 2) {
					System.out.println(Entrada2()); 
				}
				if (num == 3) {
					System.out.println(Entrada3());
				}
				if (num == 4) {
					System.out.println(Entrada4());
				}

			}

			public static String Entrada() {
				return "o ver�o est� quente";
				
			}

			public static String Entrada2() {

				return "� outono  e est� quente";
			}

			public static String Entrada3() {

				return "� inverno e est� Frio";
			}

			public static String Entrada4() {

				return "� primavera e esta quentinho";
			}

		}

		