class staticmain
{
int x;
static int y,z;
static void mul()
{
 y=5;
 z=15;
 int m=y*z;
 System.out.println("Multiplication of y & z="+m);
}
public static void main(String ar[]) 
{
 staticmain s1=new staticmain();
 staticmain s2=new staticmain();
 s1.x=10;
 s2.x=20;
 s1.y=100;
 s2.y=200;
 System.out.println("s1's x="+s1.x);
 System.out.println("s2's x="+s2.x);
 System.out.println("s1's y="+s1.y); 
 System.out.println("s2's y="+s2.y);
 staticmain.mul(); 
}
}
