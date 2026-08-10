package javaAssignments;
//WAP to check if any number is present multiple times in the array also at which index position
public class Assi91_ArrayFunctions1 {

	public static void main(String[] args)
	{

		int i1[] = new int[6];
		i1[0] =2;
		i1[1] =20;
		i1[2] =100;
        i1[3] =100;
        i1[4] =89;
        i1[5] =100;

        int check = 100;
        for(int i=0;i<i1.length;i++)
        {
        	if(check==i1[i])
        	{
        		System.out.println("The value is present at the index-- "+ i);
        	}
        }
	}

}
