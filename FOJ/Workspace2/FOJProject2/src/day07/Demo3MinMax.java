package day07;

public class Demo3MinMax {

	public static void main(String[] args) {
		int arr[ ] = {200,64,41,65,876};
		int arrlength = arr.length;
		int min = arr[0];
		int max =arr[0];
		
		 
		
		for(int i =0 ; i < arrlength; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			
			if(max < arr[i]){
				max = arr[i];
			}
			
		}
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}

}
