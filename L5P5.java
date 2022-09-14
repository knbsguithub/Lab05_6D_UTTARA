/*5) Accept as int as param to a method and return whether it is an odd num (boolean).*/
import java.util.*;
class L5P5
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		L5P5.check(x);
	}
	public static int check(int x)
	{
		System.out.println(x%2!=0);
		System.out.println("False - Even || True - Odd");
	}
}