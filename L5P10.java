/*10) Accept an int param. Return the unit’s digit as return value (ex: 123 -> return 3, 1-> return 1, 
12330 -> return 0). Now how can you change the implementation to return the digit in the ten’s 
place?*/

import java.util.*;
class L5P10
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		L5P10.dig(x);
	}
	public static void dig(int x)
	{
		int y,r;
		/*y=x%10;
		System.out.println(r +" is unit place value");*/
		y=x%100;
		r=y/10;
		System.out.println(r +" is tens place value");
		
	}
}
	