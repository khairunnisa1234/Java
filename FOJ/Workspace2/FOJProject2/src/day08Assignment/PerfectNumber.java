package day08Assignment;

public class PerfectNumber {
	
	public static boolean isPerfect(int number){
		int sum = 0;
		for(int i = 1; i <= number/2; i++){
			if(number % i == 0){
				sum += i;
			}
		}
		return sum == number; // Return true if sum equals the number itself
	}

	public static void main(String[] args) {
		int number = 496;
		boolean isPerfectNumber = isPerfect(number);
		if(isPerfectNumber){
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}
}
