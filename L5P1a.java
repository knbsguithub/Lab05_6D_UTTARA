import java.util.*;
public class L5P1a
{
	public static void main(String[] args)
	{
		/*1. 
		Write a program to find the sum of n natural numbers using a looping statement in 
		Java. For example, consider n=10.(Which loop do you use for this and why?). Are 
		you following the BPs for adding?*/
		
		solution:
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		int sum=0;
		for(int i=0;i<=x;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		/*2. 
		Convert the following while loop to the corresponding for loop        
		int m = 5, n = 10;
		while (n>=1)
		{
			System.out.println(m*n);
			n–-;
		} */
		
		soltion:
		int m=5,n=10;
		for(n=10;n>=1;n--)
		{
		System.out.println(m*n);
		}
		
		/*3. 
		Convert following do-while loop into for loop.
		int i=1;
		int d=5;
		do{
		d=d*2
		System.out.println(d);
		i++;
		}while(i<=5);*/
		
		soltions:
		int i=1;
		int d=5;
		for(i=0;i<=5;i++)
		{
			d=d*2;
			System.out.println(d);
		}
		
		/*4. 
		Write an equivalent while() loop for the following for() loop.
		int s=0;
		for(int x=1; x<=25; x+=2)
		s+=x;*/
		
		solution:
		int s=0,x=1;
		while(x<=25)
		{
			s+=x;
			x+=2;
		}
		
		/*5 
		Study the method and answer the given questions:*/
		  for(int i=0;i<3;i++) 
		  {
			for(int j=0;j<2;j++) 
			{
				int number = (int)(Math.random() * 10);
				System.out.println(number);s
			}
         }*/
		
		/*6. 
		What will be the output for the following code?*/
		int i = 1;
        int j = 20;
        int k = 31;
        while (i < j) 
		{
             k += (i * j);
             i = i * 2;
             j--;
        }
        System.out.println("i = " + i + " j = " + j + " k = " + k);
		
		/*7. 
		What is the final value of ctr when the iterative process given below executes?*/
		int ctr = 0;
		for(int i=1 i<5;i++);
		for(int j=1 i<=5; j+=2);
		System.out.println(++ctr);
		int ctr = 0;
		for(int i=1 ; i<5;i++);
		for(int j=1 ; j<=5; j+=2);
			System.out.println(++ctr);
		
		/*8.
		How do you print the following pattern using loops in Java (show this to the lab instructor once done)
			5
			45
			345
			2345
			12345*/
		int i=0, j=0;
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();*
		
		/*9.
		char ch;
		int x = 97;
		do {
		ch = (char) x;
		System.out.print(ch + " ");
		if (x % 10 == 0)
		break;
		++x;
		} while (x <= 100);
		Do you understand what is happening in the above block of code ? do a dry run 
		on paper, what will be printed on the screen? understand the flow of control, then 
		code and run and check your output with your answer.
		char ch;*/
		
		int x = 97;
		do 
		{
			ch = (char) x;
			System.out.print(ch + " ");
			if (x % 10 == 0)
			break;
			++x;
		}
		while (x <= 100);
		
		/*10
		int x=2,y=5,z=0;*/
		
		System.out.println(x == 2); //true
		System.out.println(x != 5); //true
		System.out.println(x != 5 && y >= 5); //true
		System.out.println(z != 0 || x == 2); //true
		System.out.println(!(y < 10)); //false
		
		
		/*12. 
		Consider two in 
		values for length and breadth and check if it is a square or rectangle.*/
		
		int x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("x :");
		x=sc.nextInt();
		System.out.println("y :");
		y=sc.nextInt();
		if(x==y)
		{
			System.out.println("Its a Square");
			System.out.println("AREA= "+ x*x);
		}
		else
		{
			System.out.println("Its a Rectangle");
			System.out.println("AREA= "+ x*y);
		}
	
		/*13. 
		Write a program to check whether a given character is lowercase ( a to z ) 
		or uppercase ( A to Z ). (You can use the range of UNICODE values to do so).
		char c='V';*/
		
		if(c>='a' && c<='z')
		{
			System.out.println("LOWER CASE");
		}
		else if(c>='A' && c<='Z')
		{
			System.out.println("UPPER CASE");
		}*/
		
		/*14. 
		Convert the following if-else-if construct into switch case:*/
		
		int var=3;
		switch(var)
		{
			case 1:
			System.out.println("good");
			break;
			case 2:
			System.out.println("better");
			break;
			case 3:
			System.out.println("best");
			break;
			default:
			System.out.println("invalid");
		}
	
		/*15. 
		Find the output in the following code snippet:*/
		int ch=2;
		switch(ch) 
		{
			case 1: 
			System.out.println("All courses");
			break;
			case 2: 
			System.out.println("Simply Coding ");
			case 3: 
			System.out.println("Best Study Material");
		}
		
		/*17. 
		What will be the output of the following code?*/
		boolean b=97>='a';
		int a=65/'A'+1;
		switch(b){
			 case true:
			  a++;
		break;
			case false:
				  a+=a;
			  }
			  System.out.print(a);
			  
		//ANSWERS : ERROR
		
		/*21a*/
		for (int i = 0; i < 10; i++) 
		{
                if (i == 5)
                  break;
             System.out.println("i: " + i);
         }
         System.out.println("Out of Loop");
		 
		/*21b*/
		int j=1;
           for(int i=1;i<5;i++)
		   {
				j*=i;
				System.out.println(j);
		   }
	}
}
