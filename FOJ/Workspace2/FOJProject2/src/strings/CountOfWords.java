package strings;

public class CountOfWords {

	public static void main(String[] args) {
		
		String  sent = "this is java programming";
		 int words = sent.split("\\s").length;
		 System.out.println(words);
		 
		 int  indexOfSpace = sent.indexOf(' ');
		 char charAtIndex = sent.charAt(indexOfSpace  + 1);
		 
		 System.out.println("index of first letter of second word is: " + sent.charAt(indexOfSpace + 1));
		 System.out.println(charAtIndex);
		 System.out.println(sent.charAt(6));
		 
		 
		 //print first word using for loop
		 
		 for(int i = 0; i < sent.indexOf(" "); i++){
			 System.out.println(sent.charAt(i));
		 }
		 
 
	}

}
