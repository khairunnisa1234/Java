package day02;

public class AssignNextMultiple100 {
	
	
	public static int NextMultiple(int value){
		
		int rem  = value % 100;
		int  answer  = value + (100-rem);
		return answer;
		
	}

	public static void main(String[] args) {
		
		int result  = NextMultiple(679);
		System.out.println("next multiple of 100: " +result);
		  

	}

}
