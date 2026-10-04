package javaAssignments;

import java.util.Arrays;

//WAP to copy the value of one array into another array
public class Assi86_ArrayCopy {

	public static void main(String[] args)
	{
		int [] input = new int[4];
		input[0] =10;
		input[1] =20;
		input[2] =30;
		input[3] =40;
		
		int [] output = new int[input.length];

		for(int i = 0;i<input.length;i++)
		{
			output[i] = input[i];
		}
		System.out.println("the input array is "+ Arrays.toString(input));
		System.out.println("the output array is "+ Arrays.toString(output));

	}

}
