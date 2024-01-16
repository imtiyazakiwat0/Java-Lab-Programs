import java.util.*;
public class student
{
 static int eno;
 static String name;
 static float m1,m2,m3,tot;
static void input()
 {
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter student enrollment no:");
 eno=sc.nextInt();
 System.out.println("Enter student name:");
 name=sc.next();
 System.out.println("Enter subject1 marks:");
 m1=sc.nextFloat();
 System.out.println("Enter subject2 marks:");
 m2=sc.nextFloat();
 System.out.println("Enter subject3 marks:");
 m3=sc.nextFloat();
 }
 student(float x,float y,float z)
 {
 if(x>=50 && y>=50 && z>=50)
 { 
 tot=x+y+z;
 }
 else
 {
 tot=0;
 }
 }
 void display()
 {
 System.out.println("enrollment no is:"+eno);
 System.out.println("Name is:"+name);
 System.out.println("Marks1="+m1);
 System.out.println("Marks2="+m2);
 System.out.println("Marks3="+m3);
 System.out.println("Total="+tot);
 }
public static void main(String a[])
 {
 student[] obj=new student[3];
 for(int i=0;i<3;i++)
 { 
 student.input();
 obj[i]=new student(m1,m2,m3); 
 obj[i].display(); 
 } 
 }
}