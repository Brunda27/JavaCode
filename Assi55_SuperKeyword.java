package javaAssignments;
//WAP to Illustrating Use of Super Keyword in Method Overriding
class Saturday
{
	void logout()
	{
		System.out.println("click on logout");
	}
}
public class Assi55_SuperKeyword extends Saturday
{

	void logout()
	{
		super.logout();//calls parent class implementation
		System.out.println("close the tab");
	}
	public static void main(String[] args)
	{
		Assi55_SuperKeyword q1 = new Assi55_SuperKeyword();
		q1.logout();
	}

}
