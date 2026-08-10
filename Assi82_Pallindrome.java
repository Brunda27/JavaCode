package javaAssignments;
//WAP to check the given string palidrome or not
public class Assi82_Pallindrome {

	public static void main(String[] args) 
	{
		String input = "malayalam";
		String reverse ="";
		for(int i = input.length()-1;i>=0;i--)
		{
			char m = input.charAt(i);
			 reverse = reverse +m ;
		}
		if(input.equalsIgnoreCase(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
	}

}
