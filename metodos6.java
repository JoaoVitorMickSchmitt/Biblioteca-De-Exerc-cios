import java.util.Scanner;

public class metodos6 {

	public static void main(String[] args) {
//		George Lucas utiliza  uma  f�rmula  para  criar  os  nomes dos  personagens  em  suas  hist�rias  
//		(Jar  Jar  Binks, ObiWan Kenobi, etc).
//		A f�rmula, supostamente, �:
//
//		Seu primeiro nome na s�rie Star Wars:
//		i.Pegue as tr�s primeiras letras de seu sobrenome
//		ii.Adicione a ele as duas primeiras letras de seu nome
//
//		Seu sobrenome na s�rie Star Wars:
//		i.Pegue as duas primeiras letras do sobrenome de solteira de sua m�e
//		ii.Adicione a ele as tr�s primeiras letras do nome da cidade onde voc� nasceu
//
//
//		Crie um  m�todo chamado generateStarWarsName que  gera  um  nome  completo  Star  Wars  conforme  descrito.
//		Imprima o seu nome Star Wars
//
//		As entradas ser�o os nomes completos.
//		Para separar, por exemplo as tr�s primeiras letras do seu sobrenome, use o  atributo .charAt() das Strings)

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
