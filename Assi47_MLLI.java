package javaAssignments;
//WAP to demonstrate multilevel-level inheritance with non static method  
class five 
{
	void addition()
	{
		System.out.println("supermost class - non static method");
	}
}
class six extends five
{
	void sub()
	{
		System.out.println("super class - non static method");
	}
}
public class Assi47_MLLI extends six
{
	void multiplication()
	{
		System.out.println("non static methods of the child class");
	}
	public static void main(String[] args) 
	{
		Assi47_MLLI m1 = new Assi47_MLLI();
		m1.multiplication();
		m1.addition();
		m1.sub();
		
	}

}
