package day09;

public class Demo3Function {
	
	public static void displayArray(int arr[][]){
 		
		for(int i = 0; i<3; i++){
			for(int j = 0; j < 3 ; j++){
				System.out.print( arr[i][j] + "  ");
			}
			System.out.println(" ");
				
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr1[] []= new int [] [] {{10,20,30},{40,50,60},{70,80,90}};
		int arr2[] []= new int [] [] {{11,21,32},{43,50,60},{70,10,99}};
		int arr3[] []= new int [] [] {{12  ,24,35},{44,52,69},{40,89,95}};
		
		displayArray(arr1);
		displayArray(arr2);
		displayArray(arr3);

	}

}
