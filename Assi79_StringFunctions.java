package javaAssignments;
//WAP on string functions length ,charAt() ,concat
public class Assi79_StringFunctions 
{
	
	public static void main(String[] args)
	{
		String s = "I Am Brunda ";
		char c = s.charAt(3);
		System.out.println("the char at index position 3 is " + c);
		int b = s.length();
		System.out.println("The length of sentence is " + b);
		String g =s.concat("and she is good girl");
		System.out.println("after concatenation the sentence is "+ g );
	}

}
