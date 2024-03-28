package day04;

public class Assignment2 {

	public static int isEven(int number) {
		// TODO Auto-generated method stub
		 if (number <= 0) {
	            return -1; // Return -1 for negative or zero number
	        } else if (number % 2 == 0) {
	            return 1; // Return 1 for even number
	        } else {
	            return 0; // Return 0 for odd number
	        }
	    }

		public static void main(String[] args) {
			System.out.println(isEven(22)); 
	        System.out.println(isEven(35)); 
	        System.out.println(isEven(-5)); 
	        System.out.println(isEven(0));

	}

}
