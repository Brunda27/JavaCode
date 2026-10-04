package javaAssignments;
//WAP on string function matches(), replace(char a, char b),
//replace(charSeq a, charSeq b) and replaceAll(string regx, string)
public class Assi83_StringFunctions3 {
	
	public static void main(String[] args)
	{
		String a = "Manual";
		boolean b1= a.matches("(.*)l");
		System.out.println(b1);
		String out = "it is a good day";
		boolean b2 = out.matches("(.*)goo(.*)");
		System.out.println(b2);
		String c = a.replace('M', 'm');
		System.out.println("after replacing the string is  "+ c);
		String d = out.replace("good", "bad");
		System.out.println("after replace the sentence is " + d);
		String e = a.replaceAll("[a-z]", "auto");
		System.out.println("replaces all small letters with auto --->" + e);
		String f = a.replaceAll("[A-Z]", "done");
		System.out.println("replaces all capital letters with done --->" + f);
		String g = "kv no 907";
		String h = g.replaceAll("[0-9]", "ok");
		System.out.println("replaces all numbers with ok---> " + h);


		
	}

}
