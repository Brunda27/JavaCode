package javaAssignments;
//WAP to chekc if 100 is a part of your array
public class Assi89_ArrayContains {

	public static void main(String[] args) 
	{
		int i1[] = new int[4];
		i1[0] =2;
		i1[1] =20;
		i1[2] =200;
        i1[3] =100;
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
