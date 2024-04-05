public class day09Assignmnet {
	
	public static void printNonDuplicates(int arr[]) {
		int prev = arr[0];
		System.out.println(prev); // Print the first element regardless
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != prev) {
				System.out.println(arr[i]);
			}
			prev = arr[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 1, 3, 2, 4, 5, 6};
		printNonDuplicates(arr); // Call the function to print non-duplicates
	}
}
