package javaAssignments;

import java.util.Arrays;

//WAP to check if the given string contains only alphabets
public class Assi93_StringContains {

	public static void main(String[] args)
	{
		String a  = "Good day 123";
		int check =0;
		char[] c1 = a.toCharArray();
		System.out.println("converting string into array --> " + Arrays.toString(c1));
		for(int i =0;i<c1.length;i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1 ==true)
			{
				check++;
			}
		}
		System.out.println("The number of alphabets in string are ---> "+ check);

		if(check==c1.length)
		{
			System.out.println("String contains only alphabets");
		}
		else
		{
			System.out.println("String does not contains only alphabets");

		}
		
	}

}
