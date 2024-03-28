
package day02;



public class AssignTemperatureConversion {
	
	public static double CtoF(int C){
		double F = (C * 1.8)+32;
		
		return F;
	}
	public static double FtoC(int F){
		double C = (F-32) * 5/9;
		return C;
	}
	
	
	

    public static void main(String[] args) {
    	
    	double result  = CtoF(27);
    	double output =FtoC(27);
    	System.out.println("celsuis to fahrenheit: " + result);
    	System.out.println("fahrenheit to celsius: " + output);
    	
    	
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the Fahrenheit value: ");
//        double f = scanner.nextDouble();
//
//        double celsius = (f - 32) * 5 / 9;
//
//        System.out.println("Converted value in Celsius: " + celsius);
//
//        scanner.close();
    }
}
