import java.util.Scanner;

public class exerRevisao11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("digite o seu nome ");
		String nome = input.next();
		
		while (!nome.equals('n')) {
			
			System.out.println(" insira o pre�o do produto");
			double precoProduto = input.nextDouble();
			
			System.out.println(" quantas vezes voce vendeu ele?");
			double quantiaProduto = input.nextDouble();
			
			double comissao = quantiaProduto * precoProduto * 0.3;
			double totalVendas = quantiaProduto * precoProduto;
			
			System.out.println("\n ////////////////////////"
					+ "\n o nome ser�: "+nome
					+"\n a quantidade de produtos foi : "+quantiaProduto
					+ "\n o total de vendas sera: "+totalVendas+ "R$"
					+"\n o salario do vendedor ser� " +comissao);
			
				System.out.println("\n agora me responda... deseja digitar os dados de mais um vendedor: s (SIM) / n (N�O)?");
				char resposta = input.next().charAt(0);
			
				if (resposta == 's') {
					System.out.println("digite o seu nome ");
					 nome = input.next();
					
				}else {
					System.out.println(" o codigo foi encerrado ");
					break;
				}
				
			
		} 
		

	}

}
