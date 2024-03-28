package day07;

public class Demo4EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={10,20,30,40,50};
		
		for(int i=0; i<arr.length ; i+=2){
			
//			if( i % 2 == 0){
				System.out.print(arr[i] + " ");
//			}
			 
			
		}
		System.out.println();
		
       for(int i=1; i<arr.length ; i+=2){
			
//			if( i % 2 != 0){
				System.out.print(arr[i] + " ");
//			}
			 
			
		}
		System.out.println();
		
	}

}
