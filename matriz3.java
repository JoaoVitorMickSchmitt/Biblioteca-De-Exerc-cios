
public class matriz3 {

	public static void main(String[] args) {
		
		int  matriz[][] = new int [2][2];
		matriz[0][0] = 2;
		matriz[1][0] = 2;
		matriz[0][1] = 2;
		matriz[1][1] = 2;		
		
		int  matriz2[][] = new int [2][2];
		matriz2[0][0] = 4;
		matriz2[1][0] = 4;
		matriz2[0][1] = 4;
		matriz2[1][1] = 4;
		
		int determinate = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
		System.out.println(" o determinantes será " + determinate);
		
		int determinate2 = (matriz2[0][0] * matriz2[1][1]) - (matriz2[0][1] * matriz2[1][0]);
		System.out.println(" o determinantes será " + determinate);
		
		
		System.out.println((matriz[0][0] + matriz2[0][0]) + " " + (matriz[0][1] + matriz2[0][1]) + "\n"
				+ (matriz[1][0] + matriz2[1][0]) + " " + (matriz[1][1] + matriz2[1][1]));

	}

}
