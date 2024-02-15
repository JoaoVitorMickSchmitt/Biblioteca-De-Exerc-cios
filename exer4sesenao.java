import java.util.Scanner;

public class exer4sesenao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um dia do mês: ");
		int dia = input.nextInt();

		boolean dataValida = false;

		if (dia <= 31 && dia > 0) {

			System.out.println("Digite um mês do ano: ");
			int mes = input.nextInt();
			if (mes <= 12 && mes > 0) {

				System.out.println("Digite um ano: ");
				int ano = input.nextInt();

				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia != 31) {
					if (dia > 28 && mes == 2 && ano % 4 == 0) {
						dataValida = true;
					}
				}

			}

		}
		if (dataValida == false) {
			System.out.println("Data inválida");
		}
	}
}