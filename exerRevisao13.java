import java.util.Scanner;

public class exerRevisao13 {

	public static void main(String[] args) {
 
//		Foi feita uma pesquisa de audiência de canal de TV em n casas de um
//		determinado bairro de uma cidade
//		Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e 
//		o número de pessoas que estavam assistindo a TV naquele horário, considerando
//		que em cada casa só existia uma televisão.
//		Em casas onde a televisão estava desligada, foi registrado 
//		Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora,
//		o percentual de audiência.
//		A leitura deve ser finalizada quando for informado canal "fim".
		double somaPessoas4= 0;
		double somaPessoas5= 0;
		double somaPessoas9= 0;
		double somaPessoas12= 0;
		double somaPessoas = 0;
		
		double percentua4 =0;
		double percentua5 =0;
		double percentua9 = 0;
		double percentua12 =0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" em qual canal voce quer assistir? (4, 5, 9, 12)");
		String canais = input.next();
		
		System.out.println(" quantas pessoas vão ver esse canal?");
		 double qtdPessoas =input.nextInt();
		 
		while (!canais.equals("fim")) {
			
			somaPessoas = somaPessoas + qtdPessoas;
			if (canais.equals("4"))  {
				somaPessoas4 += qtdPessoas;
				
				
			}
			if (canais.equals("5")) {
				somaPessoas5 += qtdPessoas;
				
			}
			if (canais.equals("9")) {
				somaPessoas9 += qtdPessoas;
				
			}
			if (canais.equals("12")) {
				somaPessoas12 += qtdPessoas;
				
			}
			 percentua4 = (somaPessoas4 /somaPessoas) *100;
			 percentua5 = (somaPessoas5 /somaPessoas) *100;
			 percentua9 = (somaPessoas9 /somaPessoas) *100;
			 percentua12 = (somaPessoas12 /somaPessoas) *100;
			 
			 System.out.println(" em qual canal voce quer assistir? (4, 5, 9, 12)");
				 canais = input.next();
				if (canais.equals("fim")) {
					break;
				}
				 
				System.out.println(" quantas pessoas vão ver esse canal?");
				qtdPessoas =input.nextInt();
			 
				
			 
		}
	
		
		System.out.println( "do canal 4 "+percentua4+" %");
		System.out.println( "do canal 5 "+percentua5+" %");
		System.out.println( "do canal 9 "+percentua9+" %");
		System.out.println( "do canal 12 "+percentua12 + "%");
		
	
		
		

	}

}
