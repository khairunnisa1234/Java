package day03;

public class AssignSumOfDigits {

	public static void main(String[] args) {
		int num =243;
		int sum = (num / 100)+((num % 100) /10 ) +(num % 10);
		
		System.out.println("the sum of digits in " + num + "is: " + sum);
		
	}
		
		
		
		
	/* explanaition
	(num / 100) gives 2 (hundreds place digit).
	((num % 100) / 10) gives 4 (tens place digit).
	(num % 10) gives 3 (units place digit). */
////		while(num > 0 ){
//			int rem = num%10;
//			int result  = num ;
//			sum  = result+rem;
//			num= num/10;
////		}
//		System.out.println("sum ids: " +sum);
//
//	}

}
