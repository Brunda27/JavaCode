package javaAssignments;
//WAP to Demonstrate the Use of super and this in Constructors Within and Between Classes
class Monday
{
	Monday(char a)
	{
		System.out.println("Constructor 1");
	}
	Monday()
	{
		this('b');
		System.out.println("Constructor 2");
	}
}

public class Assi53_SuperAndThisCallingstatements extends Monday
{
	Assi53_SuperAndThisCallingstatements()
	{
		super();
		System.out.println("Constructor 3");

	}
	Assi53_SuperAndThisCallingstatements(int a)
	{
		this();
		System.out.println("Constructor 4");

	}
	public static void main(String[] args)
	{
		new Assi53_SuperAndThisCallingstatements(20);
	}

}
