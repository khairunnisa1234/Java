
package strings;

public class FirstOccurences {

	public static void main(String[] args) {
		String word = "This is a good vibe,is this good";
		int index = word.indexOf("xibe");

		System.out.println(index);

		if (index != -1) {
			System.out.println("found");
		} else {
			System.out.println("not found");

		}
	}

}
