package day05;

public class Demo3 {

	public static int sum(int num) {
		// TODO Auto-generated method stub
		if(num == 1)
			return 1;
		
		return num + sum(num-1);
		
	
		

	}
	public static void main(String [] args){
		System.out.println(sum(5));
		System.out.println(sum(10));
	}
}
