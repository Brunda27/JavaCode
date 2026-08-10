package javaAssignments;//WAP to display the default values of global variables without initializing them.

public class Assi19_GlobalVariable 
{
	int a ;
	static double d;
	boolean b;
	static String s;
	

	public static void main(String[] args)
	{
		Assi19_GlobalVariable m1 = new Assi19_GlobalVariable();
		System.out.println(m1.a);
		System.out.println(d);
		System.out.println(m1.b);
		System.out.println(s);
		
	}

}
