package javaAssignments;

import java.util.Scanner;

public class Assi42_Perimeter_Scannerclass {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of base of the triangle");
		double b = s1.nextDouble();
		System.out.println("Enter the value of height of the triangle");
		double h = s1.nextDouble();
		double perimeter = 0.5*b*h ;
		System.out.println("The perimeter of triangle is " + perimeter);
	}

}
