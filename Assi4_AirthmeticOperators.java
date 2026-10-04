package javaAssignments;

public class Assi4_AirthmeticOperators
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
		int a = 300;
		int b = 200;
		int sub = a-b ;
		System.out.println("subtraction is "+ sub);
	}
	static void multiplication()
	{
		int a = 32;
		int b = 20;
		int multiplication = a*b ;
		System.out.println("multiplication is " + multiplication );
	}
	static void division()
	{
		int a = 2000;
		int b = 200;
		int division = a/b ;
		System.out.println("division is " +division);
	}
	static void modulus()
	{
		int a = 25;
		int b = 2;
		int modulus = a%b ;
		System.out.println("modulus is " + modulus);
	}
		
	
	public static void main(String[] args) 
	{
		add();
		sub();
		multiplication();
		division();
		modulus();
	}
}
