class AddSub
{
 int x=6,y=2;
 int sum()
 {
 return(x+y);
 }
 int sub()
 {
 return (x-y);
 }
}
class MulDiv extends AddSub
{
int mul()
{
 return (x*y);
}
int div()
{
 return (x/y);
}
}
class mathop
{
public static void main(String a[])
{
 MulDiv obj=new MulDiv();
 System.out.println("Sum="+obj.sum());
 System.out.println("Subtraction="+obj.sub());
 System.out.println("Multiplication="+obj.mul());
 System.out.println("Division="+obj.div());
}
}
