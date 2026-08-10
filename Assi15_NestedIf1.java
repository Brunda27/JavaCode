package javaAssignments;  //WAP on nested if else block with if block and else block in which there are 3 if b locs present under else block                                               

public class Assi15_NestedIf1 
{
	public static void main(String[] args) 
  {
	int card = 1;
	int pin = 4;
	char balance ='y';
	String atm  ="Money";
		if (card==0)
		{
			System.out.println("your card is not active");
		}
		else
		{
			if(pin==4)
			{
				System.out.println("you can withdraw you amount 1");
			}
			if(balance =='y')
			{
				System.out.println("you are eligible to withdraw you amount 2");

			}
			if(atm =="Money")
			{
				System.out.println("you are eligible to withdraw you money 3");

			}
		}
	}

}
