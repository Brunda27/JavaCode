package javaAssignments;
//WAP to demonstrate more than one instance initializing block (IIB)
public class Assi76_MultipleIIB 
{
	{
	System.out.println("IIB 0");	
	}

	public static void main(String[] args)
	{
		System.out.println("Main method");
		new Assi76_MultipleIIB();

	}
	{
		System.out.println("IIB 1");	

	}

}
