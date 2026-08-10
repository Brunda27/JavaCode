package javaAssignments;

import javaClass2.Assi59B_AccessSpecifier3;

//"WAP to access Public, protected, default & private variables outside the package by becoming sub class-BY making Relation"
public class Assi59A_AccessSpecifier3 extends Assi59B_AccessSpecifier3
{

	public static void main(String[] args) 
	{
		System.out.println(a);//can access it directly by using the variable name
		System.out.println(Assi59B_AccessSpecifier3.b);//can also accessby using class name .variable name
		Assi59A_AccessSpecifier3 p1 = new Assi59A_AccessSpecifier3();
		System.out.println(p1.e);//by creating object and calling variable using reference name
		System.out.println(p1.f);

	}

}
