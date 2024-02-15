import java.text.DecimalFormat;
import java.util.Scanner;

public class exer15sesenao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("qual a primeira nota:");
		int  notaProva1 = input.nextInt();
		
		System.out.println("qual a segunda nota:");
		int  notaProva2 = input.nextInt();
		
		System.out.println("qual a terceira nota:");
		int  notaProva3 = input.nextInt();
		
		System.out.println("qual a  nota dos exercicios:");
		int  notaExercicios = input.nextInt();
		
		
		int aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;
		
		
		if (aproveitamento >= 9) {System.out.println("parabens voce tirou A APROVADO");
			
		}
		
		else if (aproveitamento >= 7.5 && aproveitamento < 9) {System.out.println("parabens voce tirou B APROVADO");
			
		}
		
		else if (aproveitamento >= 6.0 && aproveitamento < 7.5) {System.out.println("parabens voce tirou c APROVADO");
		
		}
		else if (aproveitamento >= 4.0 && aproveitamento < 6.0) {System.out.println(" voce tirou d REPROVADO");
		
		}
		else if (aproveitamento < 4) {System.out.println("parabens voce tirou C, se esforce mais, animal REPROVADO");
		
		
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
