
public class matriz2 {

	
	
	

	//Calcule o determinante da matriz abaixo:
	//
	//4  12
	//2  -3
	
	
	public static void main(String[] args) {
		int  matriz[][] = new int [2][2];
		matriz[0][0] = 4;
		matriz[1][0] = 2;
		matriz[0][1] = 12;
		matriz[1][1] = -3;
		
		int determinate = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
		System.out.println(" o determinantes será " + determinate);
		
		
		
		
		
		

	}

}
