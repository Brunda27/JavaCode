package javaAssignments;

public class Assi9_Logical_Operators
{

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		if(a>10 && b==20)//false and true then false
		{
			System.out.println("case 1");
		}
		if(a>10 || b==20)//false or true then true
		{
			System.out.println("case 2");
		}
		if(!(a>10 && b==20))//false and true then not false then true
		{
			System.out.println("case 3");
		}
		if(!(a>10 || b>=20))//false or true then not true then false
		{
			System.out.println("case 4");//false 
		}
		if((a!=b || b==20)||c==90)
		{
			System.out.println("case 5"); 
		}
	}

}
