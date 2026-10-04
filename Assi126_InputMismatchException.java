package javaAssignments;
//WAP on InputMismatchException
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assi126_InputMismatchException {

	public static void main(String[] args)
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of a");
			int a = s1.nextInt();
			System.out.println("Enter the value of b");
			int b = s1.nextInt();
			int sum = a+b;
			System.out.println("The sum of a and b is " + sum);
			s1.close();
		}
		catch(InputMismatchException i1)
		{
			System.out.println("Exception is handled");
		}
	}

}
