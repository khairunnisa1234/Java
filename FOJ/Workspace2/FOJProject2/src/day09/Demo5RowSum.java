package day09;

public class Demo5RowSum {
	
	public static void findRowSum(int arr [][])
	{
		
		for(int i = 0; i<3 ;i++){
			
			int sum = 0;
			for(int j = 0; j<3; j++){
				
				sum = sum+arr[i][j];
				
			}
			System.out.println("Row-" + (i + 1) + "sum = " + sum);
		}
		System.out.println(" ");
		
		
	}
	public static void main(String[] args) {
		int arr1[] []= new int [] [] {{1,0,0},{0,1,0},{0,0,1}};
		int arr2[] []= new int [] [] {{1,2,3},{4,5,6},{7,8,9}};
		int arr3[] []= new int [] [] {{1,0,0},{0,1,0},{0,0,1}};
		 
		findRowSum(arr1);
		findRowSum(arr2);
		findRowSum(arr2);
	}

}
