package javaAssignments;
//WAP to Check in the given String how many are special char present
public class Assi96_String_SpecialCharCount {

	public static void main(String[] args) 
	{
		String a ="mnbrunda27@yahoo.com ";
		int CountAlphabet = 0;
		int CountDigit = 0;
		int CountSpaces = 0;
		char c2[] =a.toCharArray();
		for(int i =0;i<c2.length;i++)
		{
			if(Character.isAlphabetic(c2[i]))
			{
				CountAlphabet++;
			}
			if(Character.isWhitespace(c2[i]))
			{
				CountSpaces++;
			}
			if(Character.isDigit(c2[i]))
			{
				CountDigit++;
			}
		}
		System.out.println("The length of the String is " + c2.length);
		System.out.println("The number of alphabets in String are " + CountAlphabet);
		System.out.println("The number of spaces in String are " + CountSpaces);
		System.out.println("The number of digits in String are " + CountDigit);
		CountSpaces = a.length() -(CountAlphabet+CountSpaces+CountDigit);
		System.out.println("The number of special characters in String are " + CountSpaces);


	}

}
