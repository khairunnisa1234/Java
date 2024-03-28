package day04;

import java.text.DecimalFormat;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 12.33333333333333;
		 DecimalFormat df = new DecimalFormat("#.##");
		 String formattedNumber = df.format(number);
		 System.out.println("Formatted number: " + formattedNumber);

	}

}
