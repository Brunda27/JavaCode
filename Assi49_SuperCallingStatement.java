package javaAssignments;
//WAP to demonstrate the use of super() to call a parent class constructor.
class v3

{
	v3()
	{
		System.out.println("Constructor 3");
	}
}
class v2 extends v3
{
	v2()
	{
		System.out.println("Comstructor 2");
	}
}
public class Assi49_SuperCallingStatement extends v2
{
	Assi49_SuperCallingStatement()
	{
		
		System.out.println("Comstructor 1");
	}

	public static void main(String[] args) 
	{
		new Assi49_SuperCallingStatement();
	}

}
