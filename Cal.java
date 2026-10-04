package javaClass2;

import java.util.Scanner;

public class Cal 
{

	public static void main(String[] args)
	{
		 
			   Scanner s1 = new Scanner(System.in);
			   System.out.println("Please enter the number you want to add");
			    int a = s1.nextInt();
			    for(int i = 1 ;i<=a; i++)
			    {
			      System.out.println("Please enter the " + i +" number" );
			      double d = s1.nextDouble();
			     d =  d++;
			    }
			    System.out.println("addition of 4 number are " + d);
			    s1.close();
	}

}
