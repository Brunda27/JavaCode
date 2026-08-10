package javaAssignments;
//WAP For demonstrating multiple-level inheritance using 4 parent interfaces.
interface i101
{
	void method1();
}
interface i202
{
	void method2();
}
interface i3
{
	void method3();
}
interface i4
{
	void method4();
}

public class Assi72_MultipleLevelInheritance implements i101,i202,i3,i4
{
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3");
	}
	public void method4()
	{
		System.out.println("method4");
	}
	public static void main(String[] args) 
	{
		Assi72_MultipleLevelInheritance a1 = new Assi72_MultipleLevelInheritance();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
	}

}
