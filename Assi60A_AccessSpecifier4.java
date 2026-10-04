package javaAssignments;

import javaClass2.Assi60B_AccessSpecifier4;

//without becoming sub classWAP to access Public, protected, default & private variables outside the package 

public class Assi60A_AccessSpecifier4 
{

	public static void main(String[] args) 
	{
		System.out.println(Assi60B_AccessSpecifier4.a);
		Assi60B_AccessSpecifier4 p2 = new Assi60B_AccessSpecifier4();
		System.out.println((p2.e));

	}

}
