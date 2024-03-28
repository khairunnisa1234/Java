package day08Assignment;
import java.util.*;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int number = 4657;
		int originalnumber = number;
		int result = 0;
		while(originalnumber != 0){
			int rem = originalnumber % 10;
			result += (int) Math.pow(rem, 3);
			originalnumber= originalnumber /10;
			
		}
	
		if(result == number){
			System.out.println(number  + "is Amstrong");
		}
		else{
			System.out.println(number  + "is not amstrong");
		}
		

	}

}
