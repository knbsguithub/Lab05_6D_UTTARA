/*9) Accept 3 ints as params to a method. 
Return the second biggest value amongst the 3 to the invoker.*/
import java.util.*;
class L5P9
{
	public static void main(String[] args)
	{
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		System.out.println("y :");
		y=sc.nextInt();
		System.out.println("z :");
		z=sc.nextInt();
		L5P9.sec(x,y,z);
	}
	public static void sec(int x,int y,int z)
	{
		int max;
		if(x>y && x>z)
		{
			if (y>z)
			{
				System.out.println("y is the second largest");
			}
			else
			{
				System.out.println("z is the second  largest");
			}
		}
		else if(y>x && y>z)
		{
			if (x>z)
			{
				System.out.println("x is the second largest");
			}
			else
			{
				System.out.println("z is the second largest");
			}
		}
		else if(x>y)
		{
			System.out.println("x is the second largest");
		}
		else
		{
			System.out.println("y is the second largest");
		}
	}
}