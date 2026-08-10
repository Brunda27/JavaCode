package javaAssignments;

public class Assi44A_MultiLevelInheritance_StaticMethods extends Assi44B_MultiLevelInheritance_StaticMethods
{
	static void multiplication()
	{
		System.out.println("I am child class");
	}
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		multiplication();
	}
}
