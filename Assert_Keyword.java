package javaAssignments;

public class Assert_Keyword {

	public static void main(String[] args) 
	{
		int age =10;
		assert age>=18:"condition is not matched";
		
		if(age>=18)
		{
			System.out.println("he can vote");
		}
		else
		{
			System.out.println("he cannot vote");
		}
	}

}
