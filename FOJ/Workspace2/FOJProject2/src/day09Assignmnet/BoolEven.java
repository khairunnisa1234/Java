package day09Assignmnet;

public class BoolEven {

    public static boolean isSumOfEvenPositionsOdd(int n) {
        int sum = 0;
        int i = 1;
        
        while (n > 0) {
            int rem = n % 10;
            if (i % 2 != 0) {
                sum = sum + rem;
            }

            n = n / 10;
            i++;
        } 
        System.out.println("sumof dgits: " + sum);
        return sum % 2 != 0; // Return true if the sum of digits at even positions is odd, false otherwise
    }

    public static void main(String[] args) {
        int n = 56997;
        		
        System.out.println(isSumOfEvenPositionsOdd(n));
    }
}
