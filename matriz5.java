import java.util.Scanner;

public class matriz5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaNotas = 0;
		int mediaNotas = 0;
		int casaMenor = Integer.MAX_VALUE;
		int precoMenor = 0;
		int casaMaior = Integer.MIN_VALUE;
		int quartos = 0;
		int quartosMenor = 0;
		int tamanhoCasaQuartosMenor = Integer.MAX_VALUE;
		int tamanhoCasaMenosQuartos =0;
		int tamanhoCasaQuartosMaior = Integer.MIN_VALUE;
		int tamanhoCasaMaisQuartos =0;
		int casaTamanhoMaior = 0;
		int casaMaisDe300 = 0;
		int contadorCasa300 = 0;
		int mediaTamanhoCasa300 = 0;
		int [][]matriz = { 
		
		{2104,	3,	399900},
		{1600,	3,	329900},
		{2400,	3,	369000},
		{1416,	2,	232000},
		{3000,	4,	539900},
		{1985,	4,	299900},
		{1534,	3,	314900},
		{1427,	3,	199000},
		{1380,	3,	212000},
		{1494,	3,	242500},
		{1940,	4,	240000},
		{2000,	3,	347000},
		{1890,	3,	330000},
		{4478,	5,	699900},
		{1268,	3,	259900}

		};
		for (int i = 0; i < matriz.length; i++) {
			
				
			 somaNotas = matriz[i][2] + somaNotas;
			if (matriz[i][0] < casaMenor) {
				precoMenor = matriz[i][2];
				
			}
			if (matriz[i][2]  > casaMaior ) {
				casaMaior = matriz[i][2];
				quartos  = matriz[i][1];
			}
			if (matriz[i][1] > tamanhoCasaQuartosMaior  ) {
				tamanhoCasaQuartosMaior = matriz[i][1];
				tamanhoCasaMaisQuartos = matriz[i][0];
				
			}
			if (matriz[i][1] < tamanhoCasaQuartosMenor  ) {
				tamanhoCasaQuartosMenor = matriz[i][1];
				tamanhoCasaMenosQuartos = matriz[i][0];
				
			}if (matriz[i][2] > 300000) {
				casaMaisDe300 = matriz[i][0] + casaMaisDe300;
				contadorCasa300 = contadorCasa300 + 1;
				
			} 	
			
			
		}
		
		mediaNotas = somaNotas / matriz.length;
	
		int diferencaTamanhoCasas = tamanhoCasaMaisQuartos - tamanhoCasaMenosQuartos;
		mediaTamanhoCasa300 = casaMaisDe300 / contadorCasa300;
		System.out.println("A média dos preços das casas é " + mediaNotas);
		System.out.println("A menor casa custa " + precoMenor + " e a casa mais cara tem " + quartos+ " quartos");
		System.out.println("A diferença de tamanho da casa com o maior número de quartos para a casa com o menor número de quartos é " + diferencaTamanhoCasas);
		System.out.println("A média do tamanho das casas que custam mais de 300.000 mil é " + mediaTamanhoCasa300);
	
	
	}
	

}
