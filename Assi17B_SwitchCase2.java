package javaAssignments;//WAP on switch case problem with String

public class Assi17B_SwitchCase2
{
	public static void main(String[] args)
	{
		String input = "marathi";
		switch(input)
		{
		case "hindi":
			System.out.println("choose language is hindi");
			break;
		case "kannada":
			System.out.println("choose language is kannada");
			break;
		case "english":
			System.out.println("choose language is english");
			break;
			default :
				System.out.println("incorrect input");
			
		}	
	}
}
