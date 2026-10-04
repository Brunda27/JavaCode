package javaAssignments;
//WAP on string function toUpperCase(), toLowerCase(), equals(), equalsIgnoreCase(), Contain(), 
public class Assi80_Stringfunctions {

	public static void main(String[] args)
	{
		String a = "automation";
		//String c ="Automation";
		System.out.println(a.toUpperCase());
		String b = "GOOD";
		System.out.println(a.toLowerCase());
		boolean b1 = a.equals(b);
		System.out.println(b1);
		String S = "good";
		boolean b2 = b.equalsIgnoreCase(S);
		System.out.println(b2);
		String g = "Good day";
		boolean b3 = g.contains("day");
		System.out.println(b3);
	}

}
