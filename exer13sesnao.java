import java.util.Scanner;

public class exer13sesnao{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int irmaoVelho = 0;
		int irmaoNovo = 0;
		int irmaoMeio = 0;
		
		System.out.println("Qual é a idade do marquinhos?");
		int marquinhos = input.nextInt();

		System.out.println("Qual é a idade do zezinho");
		int zezinho = input.nextInt();

		System.out.println("Qual é a idade da luluzinha");
		int luluzinha = input.nextInt();


		if (marquinhos> zezinho && zezinho > luluzinha) {
			irmaoVelho= marquinhos;
			irmaoMeio = zezinho;
			irmaoNovo = luluzinha;
				System.out.println("o irmao mais velho é o marquinhos com "+irmaoVelho+" anos e o irmao do meio é o zezinho com  " +irmaoMeio + " anos e o irmao mais novo é a luluzinha com  " + irmaoNovo+ " anos");
		}
		else if (zezinho> luluzinha && luluzinha > marquinhos) {
			irmaoVelho= zezinho;
			irmaoMeio = luluzinha;
			irmaoNovo = marquinhos;
				System.out.println("o irmao mais velho é o zezinho com "+irmaoVelho+" anos e o irmao do meio é o luluzinha com  " +irmaoMeio + " anos e o irmao mais novo é a marquinhos com  " + irmaoNovo+ " anos");
		}
		else if (luluzinha> marquinhos && marquinhos > zezinho) {
			irmaoVelho= luluzinha;
			irmaoMeio = marquinhos;
			irmaoNovo = zezinho;
				System.out.println("o irmao mais velho é o luluzinha com "+irmaoVelho+" anos e o irmao do meio é o marquinhos com  " +irmaoMeio + " anos e o irmao mais novo é a zezinho com  " + irmaoNovo+ " anos");
		}
		else if (luluzinha> zezinho && zezinho > marquinhos) {
			irmaoVelho= luluzinha;
			irmaoMeio = zezinho;
			irmaoNovo = marquinhos;
				System.out.println("o irmao mais velho é o luluzinha com "+irmaoVelho+" anos e o irmao do meio é o zezinho com  " +irmaoMeio + " anos e o irmao mais novo é a marquinhos com  " + irmaoNovo+ " anos");
		}
		else if (zezinho> marquinhos && marquinhos > luluzinha) {
			irmaoVelho= zezinho;
			irmaoMeio = marquinhos;
			irmaoNovo = luluzinha;
			System.out.println("o irmao mais velho é o zezinho com "+irmaoVelho+" anos e o irmao do meio é o marquinhos com  " +irmaoMeio + " anos e o irmao mais novo é a luluzinha com  " + irmaoNovo+ " anos");
		}
		else if (marquinhos> luluzinha && luluzinha > zezinho) {
			irmaoVelho= marquinhos;
			irmaoMeio = luluzinha;
			irmaoNovo = zezinho;
			System.out.println("o irmao mais velho é o marquinhos com "+irmaoVelho+" anos e o irmao do meio é o luluzinha com  " +irmaoMeio + " anos e o irmao mais novo é a zezinho com  " + irmaoNovo+ " anos");
		}
	}
}