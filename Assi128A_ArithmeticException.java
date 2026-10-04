package javaAssignments;
//WAP on ArithmeticException and StringIndexOutOfBounds Exception
public class Assi128A_ArithmeticException
{

	public static void main(String[] args)
	{
		try
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException i1)
		{
			System.out.println("Exception is handled");
		}
	}

}
