import java.util.Scanner;

public class vetor13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaNotasHomem = 0;
		int somaNota = 0;
		int media = 0;
		int mediaHomens = 0;
		int mulherJovem = Integer.MAX_VALUE;
		int notaMJovem = 0;
		int contadorMulherVelha = 0;
		int mulherVelha = 0;

		int vetorSexo[] = new int[5];
		int vetorIdade[] = new int[vetorSexo.length];
		int vetorNota[] = new int[vetorSexo.length];

		for (int i = 0; i < vetorSexo.length; i++) {
			System.out.println("Qual é seu sexo (1=feminino 2=masculino)?");
			int sexo = input.nextInt();
			vetorSexo[i] = sexo;

			System.out.println("Dê uma nota para o cinema (zero até dez):");
			int nota = input.nextInt();
			vetorNota[i] = nota;
			somaNota = somaNota + nota;

			System.out.println("Qual é sua idade?");
			int idade = input.nextInt();
			vetorIdade[i] = idade;

			if (vetorSexo[i] == 2) {
				somaNotasHomem = somaNotasHomem + vetorNota[i];
			}

			if (vetorSexo[i] == 1 && vetorIdade[i] < mulherJovem) {
				mulherJovem = vetorIdade[i];
				notaMJovem = vetorNota[i];
			}

		}
		media = somaNota / 5;
		for (int i = 0; i < vetorSexo.length; i++) {
			if (vetorSexo[i] == 1 && vetorIdade[i] > 50 && vetorNota[i] > media) {
				contadorMulherVelha++;
			}
		}

		mediaHomens = somaNotasHomem / 5;
		System.out.println("A nota média recebida pelo cinema foi " + media);
		System.out.println("A nota média atribuída pelos homens é " + mediaHomens);
		System.out.println("A mulher mais jovem deu a nota " + notaMJovem);
		System.out.println(
				"A quantidade das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema é "
						+ contadorMulherVelha);
	}

}