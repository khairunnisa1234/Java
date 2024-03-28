package day04;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(emiCalculate(850000));
	}
	public static double emiCalculate(double number ){
		 double downPayment = 150000;
		 double remaining = number - downPayment;
		 double total = (remaining * 12)/100;
		 double pay = (total + remaining)/48;
		 return pay;

	}

}
