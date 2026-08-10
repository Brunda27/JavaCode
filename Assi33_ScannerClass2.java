package javaAssignments;

import java.util.Scanner;

//WAP to Calculate the Circumference of a Circle and triange using scanner class
public class Assi33_ScannerClass2 
{
	static Scanner s1 = new Scanner(System.in);
	static  void circle()
	{		
		System.out.println("Enter the value of radius" );
		double radius = s1.nextDouble();
		double circumference = 2*Math.PI*radius ;
		System.out.println("The circumference of a circle is " + circumference );
	}
	 void triangle()
	{
		System.out.println("Enter the value of base of the traingle" );
		double base = s1.nextDouble();
		System.out.println("Enter the value of height of teh triangle" );
		double height = s1.nextDouble();
		double perimeter = 0.5*base*height ;
		System.out.println("The perimeter of a traingle is " + perimeter );

	}
	public static void main(String[] args)
	{
		Assi33_ScannerClass2 b1 = new Assi33_ScannerClass2();
		circle();
		b1.triangle();
	}

}
