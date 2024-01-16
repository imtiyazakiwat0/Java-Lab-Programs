import java.io.*;
interface circle
{
float pi= 3.142f ;
float compute ( float r );
}
class rect
{
float compute ( float l, float b )
{
return ( l * b ) ;
}
}
class area extends rect implements circle
{
public float compute ( float r )
{
return ( pi * r * r );
}
}
class multiple
{
public static void main(String args[])
{
area a = new area ();
System.out.println ( "Area of circle=" + a.compute ( 1f ) );
System.out.println ( "Area of rectangle=" + a.compute ( 5f, 10f ) );
}
}