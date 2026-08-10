package javaAssignments;

/*WAP using for loop to print the output as :
Todays date is: 10
Month is: March
Year is: 2026
Hour is: 20
Min is: 53
Sec is" 46

To print the above mentioned output use input string as :
String input="10 March 2026 20 53 46";*/

public class Assi100_DateFormat 
{

	public static void main(String[] args) 
	{
		String input="10 March 2026 20 53 46";
		String[] data = input.split(" ");
		
		String[] labels = 
		        {
		            "Todays date is: ",
		            "Month is: ",
		            "Year is: ",
		            "Hour is: ",
		            "Min is: ",
		            "Sec is: " 
		         };
		for(int i = 0;i<data.length;i++)
		{
			System.out.println(labels[i] + data[i]);
		}		
	}

}
