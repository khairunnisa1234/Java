package day09;

public class Demo6DiagonalSum {
	
	
	public static   int principlDiagonalSum(int arr[][]){
		
		int sum =0 ;
		for(int i = 0 ;i<3; i++){
			
			for(int  j = 0 ;j < 3; j++){
				if(i == j){
					sum =sum+arr[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr1[] []= new int [] [] {{10,20,30},{40,50,60},{70,80,90}};
		int arr2[] []= new int [] [] {{11,21,32},{43,50,60},{70,10,99}};
		int arr3[] []= new int [] [] {{12,24,35},{44,52,69},{40,89,95}};
		
		System.out.println(principlDiagonalSum(arr1));
		System.out.println(principlDiagonalSum(arr2));
		System.out.println(principlDiagonalSum(arr3));

	}

}
