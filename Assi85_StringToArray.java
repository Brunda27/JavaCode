package javaAssignments;

import java.util.Arrays;

//WAP to convert string into array 
public class Assi85_StringToArray {

	public static void main(String[] args) 
	{
		String a = "Infosys limited";
		char[] c2 = a.toCharArray();
		/*for (int i = 0 ;i<c2.length ;i++)
		{
			System.out.println(c2[i]);
		}*/
		System.out.println(Arrays.toString(c2));
	}

}
