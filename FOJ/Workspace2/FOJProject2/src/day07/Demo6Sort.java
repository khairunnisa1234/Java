package day07;


//sorting 

public class Demo6Sort {
	
	public static int[] sortAscending(int arr[]){
		
		int temp = 0;
		//No of passes
		for(int i = 0; i < arr.length-1; i++){
			
			for( int j = 0; j < arr.length-1-i; j++){
				
				if (arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1 ] = temp;
				}
			}
				
		} 
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={3,2,-1,6,-7,4};
		 
		
		System.out.println("before sorting: ");
		for(int  i = 0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println(" \n");

		sortAscending(arr);
		
		System.out.println("After Sorting: ");
		for(int i = 0; i <arr.length; i++){
			System.out.print(arr[i] + " ");
		}

	}

}
