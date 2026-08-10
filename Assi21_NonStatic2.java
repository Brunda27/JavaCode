package javaAssignments;//WAP to call 2 non static methods inside the main method by creating a single object

public class Assi21_NonStatic2 
{
	void add()
	{
		int a = 20;
		int b = 30;
		int sum = a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int a = 20;
		int b = 30;
		int sub = a-b;
		System.out.println(sub);
	}
	public static void main(String[] args)
	{
		Assi21_NonStatic2 a1 = new Assi21_NonStatic2();
		a1.add();
		a1.sub();
	}

}
