package day04;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the time taken (hours, minutes, seconds): ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        int totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        double speedInMetersPerSecond = distance / totalTimeInSeconds;

        double speedInKilometersPerHour = (distance / 1000) / (totalTimeInSeconds / 3600.0);

        double speedInMilesPerHour = (distance / 1609.34) / (totalTimeInSeconds / 3600.0);

        System.out.println("Speed:");
        System.out.println("Meters per second: " + speedInMetersPerSecond);
        System.out.println("Kilometers per hour: " + speedInKilometersPerHour);
        System.out.println("Miles per hour: " + speedInMilesPerHour);

        scanner.close();

	}

}
