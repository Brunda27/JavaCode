package javaAssignments;

import java.util.Arrays;

//WAP to check if the given string is anagram
public class Assi92_StringAnagram {
	
	public static void main(String[] args)
	{
		String a = "god";
		String b = "god";
		if(a.length()!=b.length())
		{
			System.out.println("Length of the strings are not equal and therfore it is not an angram");
		}
		else
		{
  //step 1 convert string into array	
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		System.out.println("After converting into array c1 is --" + Arrays.toString(c1));
		System.out.println("After converting into array c2 is --" + Arrays.toString(c2));

//step 2 sort the array 
		Arrays.sort(c1);
		System.out.println("After sorting into array c1 is --" + Arrays.toString(c1));
		Arrays.sort(c2);
		System.out.println("After sorting into array c2 is --" + Arrays.toString(c2));

//step 3 compare both the arrays
		if(Arrays.equals(c1, c2))
		{
			System.out.println("The given words are anagram");
		}
		else
		{
			System.out.println("The given words are not anagram");
		}
		}
		
		
	}

}
