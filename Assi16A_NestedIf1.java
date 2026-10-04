package javaAssignments; //WAP which there is if else if block present and a) if block is present with 2 if blocks in it

public class Assi16A_NestedIf1 
{

	public static void main(String[] args)
	{
		int age = 30;
		if(age >18)
		{
			if(age>=18)
			{
				System.out.println("18+ older");
			}
			if(age>=24)
			{
				System.out.println("age is between 18-24");
			}
		}
		else if(age==18)
		{
			System.out.println("she is eligible to vote");

		}
		else
		{
			System.out.println(" minor");
		}
	}

}
