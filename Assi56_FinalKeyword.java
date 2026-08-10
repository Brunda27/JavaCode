package javaAssignments;
//WAP to Illustrating the Use of Final Keyword to Prevent Method Overriding
class Sunday
{
	final void login() //using final keyword
	{
		System.out.println("login using username");
	}
}

public class Assi56_FinalKeyword extends Sunday
{
	void loginOut() //breaking the rules of method overriding that  is changing the method name
	{
		System.out.println("login using phone number");

	}
	public static void main(String[] args)
	{
		Assi56_FinalKeyword S1 = new Assi56_FinalKeyword();
		S1.login();
	}

}
