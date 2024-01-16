class A implements Runnable
{
public void run()
{
 for(int i=1;i<=5;i++)
 {
 System.out.println("From ThreadA i value is="+i);
 }
 System.out.println("Exit from ThreadA ");
}
}
class B implements Runnable
{
public void run()
{
 for(int j=1;j<=5;j++)
 {
 System.out.println("From ThreadB j value is="+j);
 }
 System.out.println("Exit from ThreadB ");
}
}
class C implements Runnable
{
public void run()
{
 for(int k=1;k<=5;k++)
 {
 System.out.println("From ThreadC k value is="+k);
 }
 System.out.println("Exit from ThreadC ");
}
}
class runnablemain
{
 public static void main(String args[])
 {
 A t1=new A();
 Thread ta=new Thread(t1);
 B t2=new B();
 Thread tb=new Thread(t2);
 C t3=new C();
 Thread tc=new Thread(t3);
 ta.start();
 tb.start();
 tc.start();
 }
}