package javaAssignments;
//WAP to demonstrate the use of this() to call a constructor within the same class.
public class Assi52_ThisCallingStatement 
{
	Assi52_ThisCallingStatement()
	{
		this(20);
		System.out.println("Constructor without parameter");
	}
	Assi52_ThisCallingStatement(int a)
	{
		System.out.println("Constructor with parameter");

	}

	public static void main(String[] args)
	{
		new Assi52_ThisCallingStatement();
	}

}
