package javaAssignments;

//WAP to access Public, protected, default & private methods from different class but within a package(static methods)
public class Assi62B_AccessSpecifier6
{

	public static void main(String[] args)
	{
		Assi62A_AccessSpecifier6 a1 = new Assi62A_AccessSpecifier6();
		Assi62A_AccessSpecifier6.one();
		Assi62A_AccessSpecifier6.two();
		Assi62A_AccessSpecifier6.three();
		a1.five();
		a1.six();
		a1.seven();
	}

}
