package javaAssignments;

import java.util.Arrays;

//Define and Initialize two arrays of two different data type and iterate both the arrays using single for loop
public class Assi90_2Arrays_diffDataType 
{

	public static void main(String[] args)
	{
		 //datatype variable name[]	= new datatype[];
		
		double d1[] = new double[3];
		d1[0] = 2.3;
		d1[1] = 1.3;
		d1[2] = 3.3;
		char c1[] = new char[3];
		c1[0] ='a';
		c1[1] ='b';
		c1[2] ='c';
		for(int i=0;i<d1.length;i++)
		{
			System.out.println(d1[i]);
			System.out.println(c1[i]);
		}  
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(c1));


		
		
	}

}
