package javaAssignments;

public class Assi22_nonStatic3 
{
	static int a = 20;
	int b = 30;

	void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		Assi22_nonStatic3 m1 = new Assi22_nonStatic3();
		int sub = a-m1.b;;
		System.out.println(sub);
	}
	public static void main(String[] args)
	{
		sub();
		Assi22_nonStatic3 n1 = new Assi22_nonStatic3();
		n1.add();
	}
}
