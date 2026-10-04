package javaAssignments;
//WAP to Demonstrate Method Overloading Using Static and Non-Static Methods

public class Assi27_MethodOverloading 
{
	static void login(String a)
	{
		System.out.println("static method overloading 1");
	}
	static void login(int a ,int b)
	{
		System.out.println("static method overloading 2");
	}
	void logout()
	{
		System.out.println("non static method overloading 1");
	}
	void logout(char c,double d )
	{
		System.out.println("non static method overloading 2");	
	}
	public static void main(String[] args) 
	{
		login("success");
		login(2,3);
		Assi27_MethodOverloading a1 = new Assi27_MethodOverloading();
		a1.logout();
		a1.logout('c',2.345);
	}

}
