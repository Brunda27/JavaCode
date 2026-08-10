package javaAssignments; //WAP which there is if else if block present and  else block is present with just if and else block in it

public class Assi16C_Nestedif3 
{

	public static void main(String[] args) 
	{
		int count = 10000;
		if(count <5000)
		{
			System.out.println("not much active");
		}
		else if(count<8000)
		{
			System.out.println(" active");
		}
		else
		{
			if(count ==9000)
			{
				System.out.println(" pro active");
			}
			else
			{
				System.out.println(" goal achieved");

			}
		}
	}

}
