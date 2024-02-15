import java.util.Scanner;

public class metodos6 {

	public static void main(String[] args) {
//		George Lucas utiliza  uma  fórmula  para  criar  os  nomes dos  personagens  em  suas  histórias  
//		(Jar  Jar  Binks, ObiWan Kenobi, etc).
//		A fórmula, supostamente, é:
//
//		Seu primeiro nome na série Star Wars:
//		i.Pegue as três primeiras letras de seu sobrenome
//		ii.Adicione a ele as duas primeiras letras de seu nome
//
//		Seu sobrenome na série Star Wars:
//		i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
//		ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
//
//
//		Crie um  método chamado generateStarWarsName que  gera  um  nome  completo  Star  Wars  conforme  descrito.
//		Imprima o seu nome Star Wars
//
//		As entradas serão os nomes completos.
//		Para separar, por exemplo as três primeiras letras do seu sobrenome, use o  atributo .charAt() das Strings)

		Scanner input = new Scanner(System.in);

		System.out.println(" insira o seu nome ");
		String priNome = input.next();

		System.out.println(" Insira o seu Sobrenome ");
		String sobreNome = input.next();

		System.out.println(" agora insira o nome de solteira da sua mae");
		String nomeMae = input.next();

		System.out.println(" agora insira o nome da cidade onde voce nasceu");
		String nomeCity = input.next();

		generateStarWarsName(priNome, sobreNome, nomeMae, nomeCity);

	}

	public static void generateStarWarsName(String primeiNome, String sobreNome1, String nomeMae1, String nomeCity) {
		String nomStar = "";

		for (int i = 0; i < 2; i++) {

			nomStar = nomStar + primeiNome.charAt(i);
		}
		for (int i = 0; i < 3; i++) {

			nomStar += sobreNome1.charAt(i);

		}

		for (int i = 0; i < 2; i++) {

			nomStar += nomeMae1.charAt(i);
		}

		for (int i = 0; i < 3; i++) {

			nomStar += nomeCity.charAt(i);
		}

		System.out.println(nomStar);
	}

}
