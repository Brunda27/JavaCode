package javaAssignments;
//WAP demonstrating constructor chaining using this().
public class Assi51_ThisCallingStatement1
{
	Assi51_ThisCallingStatement1(String un)
	{
		System.out.println("Constructor 1");
	}
	Assi51_ThisCallingStatement1(char b ,int a)
	{
		this("good");
		System.out.println("Constructor 2");
	}
	Assi51_ThisCallingStatement1(double d , String c)
	{
		this('b',20);
		System.out.println("Constructor 3");
	}
	Assi51_ThisCallingStatement1(boolean b)
	{
		this(2.35,"mnb");
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) 
	{
		new Assi51_ThisCallingStatement1(true);
	}

}
