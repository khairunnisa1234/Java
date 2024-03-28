package day04;

public class Demo3 {

	public static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if((year % 400 == 0) || (year % 100 != 0  && year % 4 == 0))
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(1700));
		System.out.println(isLeapYear(1800));
		System.out.println(isLeapYear(1900));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1996));
		System.out.println(isLeapYear(2024));

	}

}
