package day09;

public class Demo2Matrix {

	public static void main(String[] args) {
		int arr[] []= new int [] [] {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.print( arr[i][j] + "  ");
			}
			System.out.println(" ");
				
		}
 	}

}
