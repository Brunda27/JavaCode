package javaAssignments;
//WAP to Demonstrating Method Overriding Using 4 Classes
class Sun//parent class
{
	void login()
	{
		System.out.println("Login using username");
	}
}
class Tuesday extends Sun //child class 1
{
	void login()
	{
		System.out.println("Login using gmail");
	}
}
class Wednesday extends Sun //child class 2
{
	void login()
	{
		System.out.println("Login using yahoo mail ");
	}
}
class Thursday extends Sun //child class 3 
{
void login()
{
	System.out.println("Login using phone number");
}
}
public class Assi54_MethodOverriding 
{
	
	public static void main(String[] args)
	{
		Thursday m1 = new Thursday();
		Wednesday w1 = new Wednesday();
		Tuesday t1 = new Tuesday();
		m1.login();
		w1.login();
		t1.login();

		
	}

}
