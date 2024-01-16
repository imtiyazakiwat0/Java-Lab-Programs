import java.io.*;

class trycatch
{
 public static void main(String arg[])
  {
    int a=0,b=0,c=0;
  
try
 {
   DataInputStream in =new DataInputStream(System.in);
   System.out.println("Enter the value of a and b");
   a=Integer.parseInt(in.readLine());
   b=Integer.parseInt(in.readLine());
   c=a/b;
   System.out.println("value after division a by b is = "+c);
  
 }
  catch(Exception  e)
    {
    System.out.println("Exception caught in try block");
    System.out.println("Exception is=" + e);
    System.out.println("The value of b should not be zero it creates a exception");
   }


finally
    { 
      System.out.println("I am always execute at the last ");
    }
 }
}
