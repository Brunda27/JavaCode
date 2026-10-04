package javaAssignments;

//AP to demonstrate the execution flow by including SIB, IIB, Main Method and Constructor in a single program.
public class Assi78_SIBIIB 
{
	Assi78_SIBIIB()
	{
		System.out.println("constructor 1");
	}
static
{
	System.out.println("SIB block");
}
{
	System.out.println("IIB block");
}
	public static void main(String[] args) 
	{
		new Assi78_SIBIIB();
		System.out.println("Main method");
		Assi78_SIBIIB a1 = new Assi78_SIBIIB(2.5);

	}
	
	Assi78_SIBIIB(double d)
	{
		System.out.println("constructor 2");
	}
}

