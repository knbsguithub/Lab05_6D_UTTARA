/*2) Create a class Test. Create a method named process that accepts an int as a parameter. Create 
a main method. Create a int variable x with value 10. Print the value of x to monitor using SOP. 
Then invoke process() and pass x as a parameter. Print the value in process(). Change the value 
in process(). Print the value in main() after invoking process(). Are you understanding the control 
flow? Are you understanding how parameters are being passed? */

class Test
{
	public static int process(int x)
	{
		System.out.println("proecess method");
		System.out.println(x);
		x=666;
		System.out.println("proecess method after changing");
		System.out.println(x);
		return x;
	}
	public static void main(String[] args)
	{
		int x=10;
		System.out.println("main method");
		System.out.println(x);
		x=Test.process(x);
		System.out.println("main method value of x after value change in process method");
		System.out.println(x);
	}
}