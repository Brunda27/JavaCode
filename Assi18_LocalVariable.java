package javaAssignments;//WAP to demonstrate the use of a local variable and update it .

public class Assi18_LocalVariable {

	public static void main(String[] args)
	{
		int a = 20;//local variable
		int b = 10; 
		int sum = a+b;
		System.out.println("The sum before updating the value of b is  "+ sum );
		b = 20;
		int sum1 = a+b;
		System.out.println("The sum after updating the value of b is  "+ sum1 );

	}

}
