package javaAssignments;  //"Write a Program on nested if Else Block_Case"

public class Assi8_NestedIfBlock {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		if(a!=b)
		{
			System.out.println("1");
			if(b!=c)
			{
				System.out.println("child if block");
			}
			else
			{
				System.out.println("Child else block");
			}
		}
		else
		{
			System.out.println("parent else block");
		}
		
	}

}
