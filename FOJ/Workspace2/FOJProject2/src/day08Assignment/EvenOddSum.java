package day08Assignment;

public class EvenOddSum {
	
	
	
	public static int evenSum(int arr[]){
		
		
		int sum = 0;
		for(int  i = 0; i <arr.length ; i++){
			if (i % 2 == 0){
				sum = sum+arr[i];
			}
		}
		return sum;
		 
	}
	

	public static int oddSum(int arr[]){
		int sum = 0;
		for(int  i = 0; i < arr.length ; i++){
			if (i % 2 != 0){
				sum = sum +arr[i];
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50,60};
		System.out.println(evenSum(arr));
		
		System.out.println(oddSum(arr));
		
 
	}

}
