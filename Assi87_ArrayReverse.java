package javaAssignments;

import java.util.Arrays;

//WAP to copy the value of one array into another array in the reverse orders
public class Assi87_ArrayReverse {

	public static void main(String[] args)
	{
		int [] input = new int[4];
		input[0] = 100;
		input[1] = 200;
		input[2] = 300;
		input[3] = 400;
		
		int[] reverse = new int[input.length];
		
		for(int i=0,j=input.length-1;i<input.length;i++,j--)
		{
			reverse[j] =input[i];
		}
		System.out.println("The input array is " + Arrays.toString(input));
		System.out.println("The reverse array is " + Arrays.toString(reverse));

	}

}
