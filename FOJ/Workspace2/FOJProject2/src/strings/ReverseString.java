package strings;

public class ReverseString {

	public static void main(String[] args) {
		 String  original = "Java";
		 String reversestring = "";
		 
		 for(int i = original.length()-1; i >= 0; i--){
			 reversestring = reversestring + original.charAt(i);
		 }
		/*// another method
		for(int i = 0 ; i < original.length(); i++){
			reversestring = original.charAt(i) + reversestring;
			
 			
		}*/
		System.out.println(reversestring);

	}

}
