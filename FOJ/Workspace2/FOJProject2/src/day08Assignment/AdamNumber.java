package day08Assignment;

public class AdamNumber {
    public static int squareOfNumber(int num) {
        return num * num;
    }

    public static int reverseOfNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }

    public static int squareOfReverseNumber(int number) {
        int reverse = reverseOfNumber(number);
        return reverse * reverse;
    }

    public static boolean isAdam(int number) {
        int square = squareOfNumber(number);
        int reverseSquare = squareOfReverseNumber(number);
        int reverseOfSquare = reverseOfNumber(square);
        return reverseOfSquare == reverseSquare;
    }

    public static void main(String[] args) {
        int number = 496; // Example number to check for Adam property
        System.out.println("Square of " + number + ": " + squareOfNumber(number));
        System.out.println("Reverse of square of " + number + ": " + reverseOfNumber(squareOfNumber(number)));
        System.out.println("Reverse of given number " + number + ": " + reverseOfNumber(number));
        System.out.println("Square of reverse of number " + number + ": " + squareOfReverseNumber(number));

        // Check if the number is Adam or not
        if (isAdam(number))
            System.out.println(number + " is an Adam Number");
        else
            System.out.println(number + " is not an Adam Number");
    }
}
