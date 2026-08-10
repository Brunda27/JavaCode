package javaAssignments;
//WAP to ensure the use of getter and setter
class SensitiveInformation
{
	private int age = 10;
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	
}
public class Assi131_Getter_Setter
{

	public static void main(String[] args) 
	{
		SensitiveInformation s1 = new SensitiveInformation();
		s1.setAge(25);
		System.out.println(s1.getAge());
	}

}
