package javaAssignments;
//"WAP to access Public, protected, default & private variables from different class but within a package"(non static modifier)

class two
{
	public int a = 400;
	protected int b = 500;
	int c = 600;
	private int d = 700;

}
public class Assi58B_AccessSpecifier2 
{

	public static void main(String[] args) 
	{
		two b1 = new two();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		
	}

}
