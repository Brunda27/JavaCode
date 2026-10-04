package javaAssignments;

import java.util.Arrays;

//WAP on string methods split (),isblank,()is empty()
public class Assi99_StringMethods1 
{

	public static void main(String[] args) 
	{
		String a = "";
		String b ="   ";
		System.out.println(a.isBlank());//checks if length=0 or space or tabs are present
		System.out.println(a.isEmpty());//checks if length =0
		System.out.println(b.isBlank());//checks if length=0 or space or tabs are present
		System.out.println(b.isEmpty());//here length is 3 hence isempty is false
		//split method is used to split and the char which is used to spit will be vanished
		String a1 = "tody is a good dy";
		String[] s1 = a1.split("a");
		System.out.println(Arrays.toString(s1));
		
	}

}
