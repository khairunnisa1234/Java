package day02;

import java.util.Scanner;

public class AssignmnetAreaOfCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		System.out.println("enter the radius : ");
		int r  = scanner.nextInt();

		double pi = 3.14;
		double area = pi * r * r ;
		System.out.println("area of circle: " + area);
        scanner.close();

	}

}
