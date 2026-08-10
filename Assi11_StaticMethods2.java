package javaAssignments;

public class Assi11_StaticMethods2
{
	static void add()
	{
		int a = 100;
		int b = 200;
		int add = a+b ;
		System.out.println("addition is "+ add);
	}
	static void sub()
	{
		add();
		int a = 300;
		int b = 200;
		int sub = a-b ;
		System.out.println("subtraction is "+ sub);
	}
	public static void main(String [] args)
	{
		sub();
	}
}
