package javaAssignments;
//WAP to Demonstrate Constructor Overloading in Java

public class Assi31_ConstructorOverloading
{
	Assi31_ConstructorOverloading()
	{
		System.out.println("Consturctors Overloading topic");
	}
	Assi31_ConstructorOverloading(int a)
	{
		System.out.println(a);
	}
	Assi31_ConstructorOverloading(String b , char c, long l)
	{
		System.out.println('x');
		System.out.println("Selenium");
		System.out.println(987654321l);
	}
	public static void main(String[] args)
	{
		new Assi31_ConstructorOverloading();
		new Assi31_ConstructorOverloading(23);
		new Assi31_ConstructorOverloading("good",'p',6789053l);
	}

}
