package day07;

public class DemoSumProduct {

	public static void main(String[] args) {
		 int arr[] ={1,2,5,4,6};
		 
		 int arrLength = arr.length;
		 
		 int sum =0 ;
		 int product = 1;
		 
		 for(int i =0 ;i<arr.length;i++){
			 
			 sum += arr[i];
			 product *= arr[i];
//			 System.out.println("arr[" + i + "] = " + arr[i] );
		 }
		 
		 System.out.println("sum = " +sum);
		 System.out.println("Product = " + product);

	}
	
	


}
