package javaAssignments;
//WAP to Check in the given String how many are alphabets present.
public class Assi94_String_AlphabetsCount
{

	public static void main(String[] args) 
	{
		String a ="done 1234";
		int CountAlphabet = 0;
		char c2[] =a.toCharArray();
		for(int i =0;i<c2.length;i++)
		{
			if(Character.isAlphabetic(c2[i]))
			{
				CountAlphabet++;
			}
		}
		System.out.println("The length of the String is " + c2.length);
		System.out.println("The number of alphabets in String are " + CountAlphabet);
	}

}
