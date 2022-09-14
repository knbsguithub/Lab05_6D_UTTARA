/*4)Accept an int as input to a method named printTables(int num) and then print the multiplication 
tables of the num from 1 to 10 to monitor.*/

import java.util.*;
class L5P4
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		L5P4.multiply(x);
	}
	public static void multiply(int x)
	{
		for(int a=1;a<=10;a++)
		{
			System.out.println(x+" x " + a +" = " + x*a);
		}
	}
}