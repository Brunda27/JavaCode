package javaAssignments;//WAP that declares a global variable and updates its value inside a method. 
//Display the value before and after the update.

public class Assi23_GlobalVariable1 
{
	 static int b = 35;
	 int a = 20;
	public static void main(String[] args)
	{
		System.out.println("The value of b before update is " + b);
		b = 234;
		System.out.println("The value of b after update is " + b);
		Assi23_GlobalVariable1 m1 = new Assi23_GlobalVariable1();
		System.out.println("The value of a before update is " + m1.a);
		m1.a = 125;
		System.out.println("The value of a after update is " + m1.a);

		
	}

}
