package javaAssignments;

//WAP to access Public, protected, default & private methods from different class but within a package(static methods)
public class Assi62A_AccessSpecifier6
{
	public static void one()
	{
		System.out.println("public is accessible of static method");
	}
	protected static void two()
	{
		System.out.println("protected is accessible of static method");
	}
	static void  three()
	{
		System.out.println("package is accessible of static method");
	}
	private static void four()
	{
		System.out.println("private is accessible of static method");
	}
	public void five()
	{
		System.out.println("public is accessible");
	}
	protected  void six()
	{
		System.out.println("protected is accessible");
	}
	 void seven()
	{
		System.out.println("package is accessible");
	}
	private void eight()
	{
		System.out.println("private is accessible");
	}

}
