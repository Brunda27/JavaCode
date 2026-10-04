package javaAssignments;
//"WAP to access Public, protected, default & private variables from different class but within a package"(static modifier)

class one1 
{
	public static int a = 400;
	protected static int b = 500;
	static int c = 600;
	private static int d = 700;

}
public class Assi58A_AccessSpecifier2 
{

	public static void main(String[] args) 
	{
		System.out.println(one1.a);
		System.out.println(one1.b);
		System.out.println(one1.c);
		
	}

}
