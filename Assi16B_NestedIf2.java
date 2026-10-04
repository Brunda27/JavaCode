package javaAssignments;

public class Assi16B_NestedIf2 {

	public static void main(String[] args)
	{
		int marks = 60 ;
		
		if(marks >= 80)
		{
			System.out.println("distinction");
		}
		else if(marks>=20)
		{
				if(marks<=30)
				{
					System.out.println("third class");

				}
				else if(marks>=50)
				{
					System.out.println("second class");
				}
				else
				{
					System.out.println("first class");
				}
		}
		else
		{
			System.out.println(" meet princi");
		}
	}

}
