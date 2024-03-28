package day03;

public class AssignDivisibility {
	 

	public static void main(String[] args) {
		
		int num =9;
		if(num % 3 == 0 && num%5==0){
			System.out.println("g bizz");
		}
		else if(num % 5 == 0){
			System.out.println("bizz");
		}
		else {
			System.out.println("fizz");
		}
		
		System.out.println("");

	}

}
