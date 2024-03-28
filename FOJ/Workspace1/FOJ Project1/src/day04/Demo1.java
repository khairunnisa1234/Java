package day04;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1 = 49;
		int sub2 = 49;
		int sub3 = 40;
		double total = sub1 + sub2 + sub3;
		double avg = total / 3;
		
		System.out.println("Sub1: " + sub1 );
		System.out.println("Sub2: " + sub2 );
		System.out.println("Sub3: " + sub3 );
		System.out.println("Total: " + total );
		System.out.println("Avg : " + avg );
		
		if (sub1 > 39 && sub2 > 39 && sub3 > 39){
			
			if (avg >= 75)
				System.out.println("Result: Passes in I division");
			
			else if (avg >= 60)
				System.out.println("Result: Passes in II division");
			
			else if (avg >= 50)
				System.out.println("Result: Passes in III division");
		}else{
			System.out.println("Result : Failed!!!");
		}



	}

}
