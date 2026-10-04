package javaAssignments;
// WAP to Demonstrate Multilevel Inheritance Using Concrete and Abstract Classes

class v11
{
	void login1()
	{
		System.out.println("login using phone number");
	}
	void login2()
	{
		System.out.println("login using user id");
	}
}
abstract class v22 extends v11
{
	abstract void method3();
	void login3()
	{
		System.out.println("login using gmail");
	}
}
public class Assi68_AbstractConcreteclass  extends v22
{

	public static void main(String[] args) 
	{
		Assi68_AbstractConcreteclass a1 = new Assi68_AbstractConcreteclass();
		a1.login1();
		a1.login2();
		a1.login3();
		a1.method3();
	}
	void method3()
	{
		System.out.println("logic which is not exposed");
	}

}
