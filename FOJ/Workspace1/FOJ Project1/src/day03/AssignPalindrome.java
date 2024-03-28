package day03;

public class AssignPalindrome {

	public static void main(String[] args) {
		int num =12221;
		 int ncopy = num;
		 int rev  = 0;
		 while(num >0){
			 int rem = num %10;
			 rev = (rev*10) +rem;
			 num = num /10;
		 }
		 
		 if(rev ==ncopy  ){
			 System.out.println("palindrome");
		 }
		 else{
			 System.out.println("not a palindrome");
		 }

	}

}
