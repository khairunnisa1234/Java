package day02;

public class AssignMinutesToHours {
	
	
	public static double minutesToYears( int minutes){
		double minsInYear = 365 *24 *60;

		double years = (minutes) /minsInYear;
		return years;
		
	}

	public static void main(String[] args) {
		
		int minutes  = 100000;
	
		double years = minutesToYears(minutes);
		System.out.println(minutes + "minutes is approx"  + years + "years" );
		

	}

}
