package day05;

public class Fibsequence {

	public static String generateFibsequence(int num) {
		// TODO Auto-generated method stub
		
		int lastBefore = 0;
		int last = 1 ;
		int nextNum = 0 ;
		String result = " 0 1 ";
		if( num < 0)
			return "-2";
		else if (num == 0)
			return "-1";
		else if(num == 1)
			return " 0 ";
		else if(num == 2)
			return "0 1";
		
		else{
			for( int i = 1 ;i <= num ;i++){
				nextNum = lastBefore+last;
				lastBefore = last;
				last =nextNum;
				result += nextNum + " ";
			}
			
		}
		
		return result;
		
		
		

	}
	public static void main (String [] args){
		System.out.println(generateFibsequence(5));
		System.out.println(generateFibsequence(4));
		System.out.println(generateFibsequence(2));
		System.out.println(generateFibsequence(-2));



	}

}
