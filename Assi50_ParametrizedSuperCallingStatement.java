package javaAssignments;
//WAP where the parent class has a parameterized constructor and the child class calls it using super().
class v1 
{
	v1(char c )
	{
		System.out.println("grandparent constructor");
	}
}
class v5 extends v1
{
	v5(double d ,int i)
	{
		super('b');
		System.out.println("parent class constructor");
	}
}
public class Assi50_ParametrizedSuperCallingStatement extends v5
{
	Assi50_ParametrizedSuperCallingStatement(String c,boolean b)
	{
		super(2.34 ,10);
		System.out.println("Child class constructor");
	}
	public static void main(String[] args)
	{
		new Assi50_ParametrizedSuperCallingStatement("MNB",true);
	}

}
