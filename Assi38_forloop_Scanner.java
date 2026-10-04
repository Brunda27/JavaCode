package javaAssignments;

import java.util.Scanner;
//WAP to Demonstrate For Loop Using Scanner Class
public class Assi38_forloop_Scanner 
{

	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("What is you name?");
			String a = s1.nextLine();
			System.out.println("What is you college id?");
			int b = s1.nextInt();
			System.out.println("Which section do u belong to ?");
			String c = s1.next();
		}
	}

}
