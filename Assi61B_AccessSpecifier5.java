package javaAssignments;
//WAP to access Public, protected, default & private methods within a class(non static methods)
public class Assi61B_AccessSpecifier5
{
	public void one()
	{
		System.out.println("public is accessible");
	}
	protected  void two()
	{
		System.out.println("protected is accessible");
	}
	 void three()
	{
		System.out.println("package is accessible");
	}
	private void four()
	{
		System.out.println("private is accessible");
	}
	public static void main(String[] args)
	{
		Assi61B_AccessSpecifier5 a1 = new Assi61B_AccessSpecifier5();
		a1.one();
		a1.two();
		a1.three();
		a1.four();
	}

}
