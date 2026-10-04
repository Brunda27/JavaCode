package javaAssignments;
//WAP that uses the final for both local  and global variables

public class Assi26_FinalLocalGlobal
{
	final static double r = 2.5;
	final int b = 100;
	public static void main(String[] args)
	{
		final double r = 9.9;
		System.out.println(r);
		System.out.println(Assi26_FinalLocalGlobal.r);
		final int b = 5;
		System.out.println(b);
		Assi26_FinalLocalGlobal s1 = new Assi26_FinalLocalGlobal();
		System.out.println(s1.b);
		
		
	}

}
