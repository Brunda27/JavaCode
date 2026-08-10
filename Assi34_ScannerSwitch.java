package javaAssignments;

import java.util.Scanner;

//WAP to Illustrate Switch Case Statement Using Scanner Class

public class Assi34_ScannerSwitch 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 for edge browser");
		System.out.println("Press 2 for safari browser");
		System.out.println("Press 3 for chrome browser");

		int input = s1.nextInt();
		switch(input)
		{
		case 1 :
			System.out.println("Edge browser");
			break;
		case 2 :
			System.out.println("safari browser");
			break;
		case 3:
			System.out.println("chrome browser");
			break;
			default:
				System.out.println("incorrect input");
				s1.close();
				
		}
	}

}
