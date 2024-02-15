
public class matrizInicial {

	public static void main(String[] args) {
		
		int matriz[][]  = new int  [4][3];
		matriz[0][0] = 5;
		matriz[1][0] = 5;
		matriz[2][0] = 5;
		matriz[3][0] = 5;
		matriz[0][1] = 1;
		matriz[1][1] = 1;
		matriz[2][1] = 1;
		matriz[3][1] = 1;
		matriz[0][2] = 2;
		matriz[1][2] = 2;
		matriz[2][2] = 2;
		matriz[3][2] = 2;
		
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.print(matriz[i][j]+ " ");
		}
	System.out.println();
		}
		

	}

}
