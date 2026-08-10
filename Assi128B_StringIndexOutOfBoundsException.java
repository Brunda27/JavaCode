package javaAssignments;
////WAP on ArithmeticException and StringIndexOutOfBounds Exception

public class Assi128B_StringIndexOutOfBoundsException 
{

	public static void main(String[] args) 
	{
		try
		{
			String a = "Good";
		
		a.charAt(20);
		}
		catch(StringIndexOutOfBoundsException s1)
		{
			System.out.println("Exception handled");
		}
		
	}

}
