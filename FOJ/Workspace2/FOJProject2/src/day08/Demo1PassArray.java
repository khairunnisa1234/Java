package day08;

//passing Array as an argument

public class Demo1PassArray {
	
	
	public static void showArray(int arr[]) {
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
		
		
		
	}

	public static void main(String[] args) {
		int arr[]= {10,30,40,50,69};
		
		showArray(arr);     // here i paseed as argument
		
		

	}

}
