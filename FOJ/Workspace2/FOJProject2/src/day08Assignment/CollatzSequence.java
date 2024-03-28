package day08Assignment;

public class CollatzSequence {
	
	public static  void printCollatz(int num){
		 
		while(num != 1){
			
			System.out.println(num + " ");
			
			
			if((num & 1) == 1){
				num = (3 * num)  + 1;
			}
			
			else{
				 num  = num/2;
			}
		}
		
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printCollatz(3);
		
	}

}
