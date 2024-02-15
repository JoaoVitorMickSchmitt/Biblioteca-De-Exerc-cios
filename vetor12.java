import java.util.Scanner;

public class vetor12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String resposta = "";
		
		int somaPontos = 0 ;
		String respostasHomen[] = new String[5];
		
		
			System.out.println("Gosta de música sertaneja?");
			respostasHomen[0] = input.next();
			
			System.out.println("Gosta de futebol?");
			respostasHomen[1] = input.next();
			
			System.out.println("Gosta de seriados?");
			respostasHomen[2] = input.next();
			
			System.out.println("Gosta de redes sociais");
			respostasHomen[3] = input.next();
			
			System.out.println("Gosta da Oktoberfest?");
			respostasHomen[4] = input.next();
			
			
		
		
		System.out.println(" agora o da mulher");
		
		String respostasMulher[] = new String[5];
		
		
			System.out.println("Gosta de música sertaneja?");
			respostasMulher[0] = input.next();
			
			System.out.println("Gosta de futebol?");
			respostasMulher[1] = input.next();
			
			System.out.println("Gosta de seriados?");
			respostasMulher[2] = input.next();
			
			System.out.println("Gosta de redes sociais");
			respostasMulher[3] = input.next();
			
			System.out.println("Gosta da Oktoberfest?");
			respostasMulher[4] = input.next();
			

	
		for (int i = 0; i < 5; i++) {
			
	
		if (respostasHomen[i].equals(respostasMulher[i]) ) {
			somaPontos = somaPontos+3;
			
		}
		if (respostasMulher[i].equals("IND") && respostasHomen[i].equals("SIM")
				|| respostasMulher[i].equals("IND") && respostasHomen[i].equals("NAO")
				|| respostasHomen[i].equals("IND") && respostasMulher[i].equals("SIM")
				|| respostasHomen[i].equals("IND") && respostasMulher[i].equals("NAO")) {
			somaPontos = somaPontos+1;
			
		}
		if (respostasMulher[i].equals("SIM") && respostasHomen[i].equals("NAO") 
			|| respostasMulher[i].equals("NAO") && respostasHomen[i].equals("SIM")) {
			somaPontos = somaPontos-2;
			
		}

		}
		if (somaPontos == 15) {
			System.out.println(" casem !");
			
		}
		if (somaPontos <=14 && somaPontos >=10) {
			System.out.println(" Vocês têm muita coisa em comum! ");
			
		}
		if (somaPontos <=9 && somaPontos >=5) {
			System.out.println(" Talvez não dê certo :( !");
			
		}
		if (somaPontos <=4 && somaPontos >=0) {
			System.out.println(" Talvez não dê certo :( !");
			
		}
		if (somaPontos <=-1 && somaPontos >=-9) {
			System.out.println(" Melhor não perder tempo");
			
		}
		if (somaPontos == -10) {
			System.out.println(" Vocês se odeiam!");
			
		}
		System.out.println(somaPontos);
		
}
}
