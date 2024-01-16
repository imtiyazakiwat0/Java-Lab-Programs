import java.io.*;
class add
{
void sum(int a,int b)
 {
 int res=a+b;
 System.out.println("The Addition of two no is="+res);
 }
 void sum(float f1,float f2)
 {
 float res=f1+f2;
 System.out.println("The Addition of two no is="+res);
 }
 }
class mathover
{
 public static void main(String args[])
 {
 add a1 =new add();
 a1.sum(10,20);
 a1.sum(10.50f,50.25f);
 
 }
}
