package javaAssignments;
//WAP on string functions subString(start index), subString(start index, endIndex), reverse()
public class Assi81_StirngFunctions2 
{

	public static void main(String[] args) 
	{
		String a = "Automation";
		String reverse = "";
		System.out.println(a.substring(1));
		System.out.println(a.substring(0,4));
		for(int i = a.length()-1;i>=0;i--)
		{
			char m = a.charAt(i);
			reverse = reverse +m;
		}
		System.out.println("before reverse the word is "+ a);
		System.out.println("After reverse the word is "+ reverse);

	}

}
