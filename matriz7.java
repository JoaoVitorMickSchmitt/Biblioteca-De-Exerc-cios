
public class matriz7 {

	public static void main(String[] args) {
		
		char matriz1[][] = new char[4][4];
		System.out.println("figura A : ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = '*' ;
				
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println(" ");
		}
		char matriz2[][] = new char[10][10];
		System.out.println( "\n	");
		System.out.println( "figura B:" );
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				if (j == matriz2.length - 1 || i == matriz2[i].length -1 || j== 0|| i == 0) {
					matriz2[i][j] = '*' ;
					
				}
				else {
					matriz2[i][j] = ' ';
				}
				System.out.print(matriz2[i][j]+" ") ;
				
			}
			System.out.println();
		}
		char matriz3[][] = new char[4][4];
		System.out.println( "\n	");
		System.out.println( "figura C: ");
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				
				matriz3[i][j] = '*';
			
			}
			
		}
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				
				System.out.print(matriz3[i][j] + " ");
			}
		System.out.println();
		}
		
		
		
		

	}

}
