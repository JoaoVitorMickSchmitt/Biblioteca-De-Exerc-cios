public class matriz6 {
	public static void main(String[] args) {
		int[][] matriz = { { 20, 15, 34, 47, 11 }, {15, 8, -50, 24, 4 }, { 17, 222, 44, 43, 19 } };
		boolean temRepetido = false;
		int numeroAtual = 0;
		int iNumeroAtual = 0;
		int jNumeroAtual = 0;
		int iRepetido = 0;
		int jRepetido = 0;

		for (int i = 0; i < matriz.length && !temRepetido; i++) {
			for (int j = 0; j < matriz[i].length && !temRepetido; j++) {
				numeroAtual = matriz[i][j];
				iNumeroAtual = i;
				jNumeroAtual = j;
				for (int x = 0; x < matriz.length; x++) {
					for (int y = 0; y < matriz[x].length; y++) {
						if (matriz[x][y] == numeroAtual && (iNumeroAtual != x || jNumeroAtual != y)) {
							iRepetido = x;
							jRepetido = y;
							temRepetido = true;
							break;
						}

					}
				}

			}
		}

		if (temRepetido) {
			System.out.println("O numero " + numeroAtual + " se repete no indice [" + iNumeroAtual + "][" + jNumeroAtual
					+ "]" + " e no indice [" + iRepetido + "][" + jRepetido + "]");
		} else {
			System.out.println("Nenhum numero se repete");
		}
	}
}
