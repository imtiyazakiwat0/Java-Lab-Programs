import java.io.*;
class circle
{
public static void main(String a[])
{
 float pi=3.142f;
 DataInputStream d=new DataInputStream (System.in);
 System.out.println("Enter radius of a circle:");
 try
 {
 int r=Integer.parseInt(d.readLine());
 float area = pi*r*r;
 float cir = 2*pi*r;
 System.out.println("Area of circle="+area);
 System.out.println("Circumference of a circle="+cir);
 }
 catch(Exception e)
 {
 }
}
}