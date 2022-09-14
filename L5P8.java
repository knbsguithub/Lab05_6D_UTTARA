
/*8) Accept 2 int params to a method and return the average of the two values.*/
import java.util.*;
class L5P8
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		System.out.println("y :");
		y=sc.nextInt();
		L5P8.avg(x,y);
	}
	public static void avg(int x,int y)
	{
		float a=(float)(x+y)/2;
		System.out.println(a);
	}
}