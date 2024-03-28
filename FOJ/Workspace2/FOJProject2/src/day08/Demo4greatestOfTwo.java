package day08;

public class Demo4greatestOfTwo {
	
	public static  int greatestOf2(int num1 ,int num2){
		return(num1 > num2 )? num1:num2;
	}
	
	public static int greatestOf3(int num1, int num2,int num3){
		return (num1 > num2) ? 
				((num1 > num3) ? num1 : num3) : 
					((num2 > num3) ? num2 : num3);

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println( greatestOf2(2,3));
			
			System.out.println( greatestOf2(2,3));

			System.out.println( greatestOf3(2,3,3));

			System.out.println( greatestOf3(2,3,5));

	}

}
