package javaAssignments;

//WAP Using Math Class to Display PI, Random and addExact Values
public class Assi28_MathClassMethods 
{

	public static void main(String[] args)
	{
		double r = Math.random();
		System.out.println(r);
		double pi = Math.PI;
		System.out.println(pi);
		double add = Math.addExact(2, 100);
		System.out.println(add);
		double add1 =Math.addExact(23456987654l,3456789876l);
		System.out.println(add1);		
	}

}
