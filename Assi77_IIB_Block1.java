package javaAssignments;
//WAP to demonstrate the execution flow by including SIB, IIB, Main Method and Constructor in a single program.
public class Assi77_IIB_Block1
{
	{
		System.out.println("IIB Block 1");
	}
	{
		System.out.println("IIB Block 2");
	}
	
	public static void main(String[] args) 
	{
		new Assi77_IIB_Block1();
		System.out.println("Main method");
		Assi77_IIB_Block1 c1 = new Assi77_IIB_Block1();

	}
	{
		System.out.println("IIB Block 3");
	}

}
