class  arrayexcept
{
 public static void main(String ar[])
 {
  try
  {
   int a[]=new int[-1];
   System.out.println("Exception not caught because array size is not negative");
  }
  catch(NegativeArraySizeException e)
  {
   System.out.println("Array size is initialized to Negative value");
  }
 }
}
