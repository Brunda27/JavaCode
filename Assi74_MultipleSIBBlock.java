package javaAssignments;
//WAP to Demonstrate More Than One Static Initialization Block (SIB)
public class Assi74_MultipleSIBBlock 
{
	static 
	{
		System.out.println("SIB 1");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
	}
	static
	{
		System.out.println("SIB 2");
	}
	static
	{
		System.out.println("SIB 3");
	}

}
