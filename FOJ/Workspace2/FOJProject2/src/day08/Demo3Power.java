package day08;

public class Demo3Power {
		 public static int powerOf2(int num ,int pow){
			 
			 int result = 1;
			 for(int i = 0 ; i < pow ; i++){
				 result *= num;
				 
			 }
			 return result;
		 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(powerOf2(2,5));
		System.out.println(powerOf2(4,5));

		System.out.println(powerOf2(3,5));


	}

}
