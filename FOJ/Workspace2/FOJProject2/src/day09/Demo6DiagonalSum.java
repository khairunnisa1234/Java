package day09;

public class Demo6DiagonalSum {
	
	
	public static   int principlDiagonalSum(int arr[][]){
		
		int sum =0 ;
		
		int sum1 =0;
		for(int i = 0 ;i<3; i++){
			
			for(int  j = 0 ;j < 3; j++){
				if(i == j ){
					sum =sum+arr[i][j];
				} 
				if(i+j == 2){
					sum1+=arr[i][j];
				}
			}
		}
		return sum+sum1;		
 
	}

	public static void main(String[] args) {
		int arr1[] []= new int [] [] {{1,2,3},{4,5,6},{7,8,9}};
		//int arr2[] []= new int [] [] {{1,1,3},{4,5,6},{7,1,9}};
		//int arr3[] []= new int [] [] {{2,4,5},{4,5,6},{4,8,9}};
		
		System.out.println(principlDiagonalSum(arr1));
		//System.out.println(principlDiagonalSum(arr2));
		//System.out.println(principlDiagonalSum(arr3));

	}

}
