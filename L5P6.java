/*6) Accept 2 int params to a method and return the bigger value.*/

import java.util.*;
class L5P6
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		System.out.println("y :");
		y=sc.nextInt();
		L5P6.big(x,y);
	}
	public static void big(int x,int y)
	{
		if(x>y)
		{
			System.out.println("x is largest");
		}
		else
		{
			System.out.println("y is largest");
		}
	}
}