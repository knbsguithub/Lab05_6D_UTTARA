/*7) Accept an int as param to a method. Return -1 if the int is zero. Return 1 if it is an even number. 
Return 0, if it is odd. From main(), invoke this method, pass -2,0,1,2,4,5,343 as inputs and print the 
results returned. */

import java.util.*;
class L5P7
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		int r = L5P7.evod(x);
		System.out.println(r);
	}
	public static int evod(int x)
	{
		if(x<=0)
		{
			return -1;
		}
		else if(x%2!=0)
		{
			return 0;
		}
		else if(x%2==0)
		{
			return 1;
		}
		return 0;
	}
}