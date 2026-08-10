package javaAssignments;

class thirty
{
	static void add()
	{
	System.out.println("This is supermost class");
	}

}
class twenty extends thirty 
{
	static void sub()
	{
	System.out.println("This is super class");
	}
	static void sub(int a)
	{
	System.out.println("This is super class-method overloading");
	}
}

public class Assi46_MLI_MethodOverloading extends twenty
{
	static void mul()
	{
	System.out.println("This is super class");
	}
	public static void main(String[] args)
	{
		sub(5);
		sub();
	}

}
