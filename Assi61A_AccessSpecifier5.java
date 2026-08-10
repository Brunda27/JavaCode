package javaAssignments;
//WAP to access Public, protected, default & private methods within a class(static methods)
public class Assi61A_AccessSpecifier5
{
	public static void one()
	{
		System.out.println("public is accessible");
	}
	protected static void two()
	{
		System.out.println("protected is accessible");
	}
	static void three()
	{
		System.out.println("package is accessible");
	}
	private static void four()
	{
		System.out.println("private is accessible");
	}
	public static void main(String[] args)
	{
		one();
		two();
		three();
		four();
	}

}
