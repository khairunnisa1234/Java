package day08;

public class Demo2SearchArray {
	
	public static int searchArray(int arr[] , int num){
		
		
		
		for(int i = 0 ; i <arr.length; i++){

			if(num == arr[i]){
				
				return i ;  // we will get index number
				
				// to get position number do  return i+1;  
			
			} 
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] ={30,10,210,40 ,20,40};
		
		System.out.println(searchArray(arr, 99));
		System.out.println(searchArray(arr, 10));
		System.out.println(searchArray(arr, 20));
		 
 
	}

}
