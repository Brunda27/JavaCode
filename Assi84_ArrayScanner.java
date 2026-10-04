package javaAssignments;

import java.util.Arrays;
import java.util.Scanner;
//datatype variabble name = new datatype[size]
//WAP to accept the values of array at run time
public class Assi84_ArrayScanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int [] rollno = new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the value at index -->" + i);
			rollno[i]= s1.nextInt();
		}
		System.out.println("The final array is " + Arrays.toString(rollno));
	}

}
