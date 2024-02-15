import java.util.Scanner;

public class exerRevisao10 {

//	Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada.
//	O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual.
//	Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
//	Informe também o valor total recebido pela loja ao final do dia.
//	A leitura deve ser finalizada com a leitura 0 para o valor da compra.

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double	somaValorMenor = 0;
		
			System.out.println("de o valor do produtor que voce pagou ");
			double valor = input.nextDouble();
			
		
		while (valor != 0 ) {
			
			if (valor > 500) {
			double valorFinal =	valor + valor * 0.20;
			System.out.println(" voce pagou "+valorFinal+"R$");
			
			}	if (valor <= 500) {
			double	valorFinalMenor =	valor + valor * 0.15;
				System.out.println(" voce pagou "+valorFinalMenor+"R$");
				somaValorMenor	 = somaValorMenor + valorFinalMenor;
			} 
			
			
			
		}
		
		
		

	}

}
