package javaAssignments;
//WAP to demonstrate the use of an interface.
interface logic1
{
	void method2();
	void method3();
}

public class Assi69_Interface implements logic1
{

	public static void main(String[] args) 
	{
		Assi69_Interface s1 = new Assi69_Interface();
		s1.method2();
		s1.method3();
	}
	public void method2() 
	{
		System.out.println("method 2 logic which wont get exposed");
	}
	public void method3() 
	{
		System.out.println("method 3 logic which wont get exposed");

	}

}
