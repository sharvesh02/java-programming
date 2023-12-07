import java.io.*;
import java.util.*;
class vote
{
public static void main(String args[])
{
int a;
Scanner s= new Scanner(System.in);
a=s.nextInt();
if(a>=18)
{
System.out.println("eligible");
}
else
{
System.out.println("not eligible wait for "+(18-a));
}
}
}
