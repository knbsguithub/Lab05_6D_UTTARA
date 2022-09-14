/*3) Test main() calling another static method x() which should call another static method y() in the 
same class. Put SOPs in each method to understand flow of control. How does the JVM manage 
control flow? What data structure does it internally use? Create local variables in each method. Try 
to access one methods local variable in another method. Can you access it? Why not? Where are 
local variables stored in memory? How do you explain parameter passing? Now create another 
class with name Test2 and create a static method named z() in it. Call this method from Test`s 
main() and see how control flow occurs. Create similar named local variables in main() and in x() 
and see if you get any errors during compilation. Why not? Talk to Lab Instructors if you cannot answer any of the questions given.*/

public class Test2
{
  public static void main(String[] args)
  {
    System.out.println("main() starting...");
    Test2.methodx();
    Test3.methodz();
    System.out.println("main() ending...");
  }
  public static void methodx()
  {
    System.out.println("methodx starting...");
    Test2.methody();
    System.out.println("methodx ending...");
    
  }
  public static void methody()
  {
    System.out.println("methody starting...");
    
    
  }
}

class Test3
{
  public static void methodz()
  {
    System.out.println("methodz called");
  }
  public static void main(String[]args)
  {
    System.out.println("abc");
  }
}