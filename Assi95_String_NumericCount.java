package javaAssignments;
//WAP to Check in the given String how many are numeric present.
public class Assi95_String_NumericCount {

	public static void main(String[] args)
	{
		String a ="done 1234";
		int CountDigit = 0;
		char c2[] =a.toCharArray();
		for(int i =0;i<c2.length;i++)
		{
			boolean b1 = Character.isDigit(c2[i]);
			if(b1)
			{
				CountDigit++;
			}
		}
		System.out.println("The length of the String is " + c2.length);
		System.out.println("The number of digits in String are " + CountDigit);
	}

}
