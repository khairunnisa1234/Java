package strings;

import java.util.HashMap;

public class NoOfOccurencesLetter {

	public static void main(String[] args) {
		String sentence = "this is java ,is this java";
		HashMap<Character , Integer> h = new HashMap<>();
 		 
		
		for(int i = 0 ; i < sentence.length(); i++){
			char letter = sentence.charAt(i);

			if(h.containsKey(letter)){
				int val = h.get(letter);
				h.put(letter, val+1);
				
			}else{
				h.put(letter, 1);
			}
			
		}
		
		for( char key : h.keySet()){
			System.out.println(key + " : " + h.get(key));
		}
		
 	}

}

