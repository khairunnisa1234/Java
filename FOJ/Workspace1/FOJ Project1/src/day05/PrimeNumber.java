package day05;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		
		if(n == 0 || n == 1)
			return false;
		
		for(int i = 2 ;i < n;  i++){
			if(n % i == 0)
				return false;
			
			
					
		}
		return true;

	}
	
	public static void main(String [] args){
		 int N= 10;
		 
		 for( int  i = 1; i <= N ; i++){
			 if(isPrime(i))
				 System.out.println( i + " ");
			 
		 }
		 
		
	}

}
