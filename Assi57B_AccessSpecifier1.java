package javaAssignments;
//WAP to access Public, protected, default & private variables within a class(non static modfier)

public class Assi57B_AccessSpecifier1
{
	public int a = 150;
	protected int b = 250;
	int c = 350;
	private int d = 450;
	
	public static void main(String[] args)
	{
		Assi57B_AccessSpecifier1 a1 = new Assi57B_AccessSpecifier1();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);

	}

}
