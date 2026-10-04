package javaAssignments;
//WAP on multiple catch blocks
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assi127_MiltipleCatch
{

	public static void main(String[] args) 
	{
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] rollno = new int[s1.nextInt()];
		for(int i =0;i<rollno.length;i++)
		{
			System.out.println("Enter the value of the array at the index postion--- " + i);
			rollno[i] = s1.nextInt();
		}
		System.out.println("The final array is ");
		System.out.println(Arrays.toString(rollno));
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Exception handled");
		}
		catch(NegativeArraySizeException a2)
		{
			System.out.println("Exception handled 1");

		}
	}

}
