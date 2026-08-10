package javaAssignments;

//WAP that declares an global variable and a local variable with the same name. 
//Display the value of local and global variable

public class Assi24_GlobalVariable2 
{
	static int a = 20;
	int b = 30;
	public static void main(String[] args) 
	{
		int a = 25;
		System.out.println(a);
		System.out.println(Assi24_GlobalVariable2.a);
		int b = 99;
		Assi24_GlobalVariable2 m2 = new Assi24_GlobalVariable2();
		System.out.println(b);
		System.out.println(m2.b);

	}

}
