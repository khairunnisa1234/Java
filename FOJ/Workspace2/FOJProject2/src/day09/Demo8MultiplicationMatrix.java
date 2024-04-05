package day09;

public class Demo8MultiplicationMatrix {

	public static int[][] matrixMultiplication(int a[][], int b[][]) {
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}

			}
		}
		return c;

	}

	/*
	 * public static void displayArray(int arr[][]){
	 * 
	 * for(int i = 0; i<3; i++){ for(int j = 0; j < 3 ; j++){ System.out.print(
	 * arr[i][j] + "  "); } System.out.println(" ");
	 * 
	 * } System.out.println(); }
	 */
	public static void main(String[] args) {
	    int a[][] = new int[][] { { 1, 2, 3 }, { 1, 2, 4 }, { 5, 6, 7 } };
	    int b[][] = new int[][] { { 5, 6, 7 }, { 2, 4, 5 }, { 6, 2, 3 } };
	    
	    int result[][] = matrixMultiplication(a, b);

	    // Printing the result matrix
	    for (int i = 0; i < result.length; i++) {
	        for (int j = 0; j < result[i].length; j++) {
	            System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
