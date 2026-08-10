package javaAssignments;//WAP to call non static method inside the main method

public class Assi20_Nonstatic1 
{
	void add()
	{
		int a = 20;
		int b = 30;
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Assi20_Nonstatic1 m1 = new Assi20_Nonstatic1();
		m1.add();
	}

}
