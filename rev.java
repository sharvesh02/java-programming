import java.io.*;
import java.util.*;
class rev
{
public static void main(String args[])
{
String a2;
int j,temp,r,a1=0,a=0;
Scanner s= new Scanner(System.in);
a2=s.nextLine();
try
{
a=Integer.parseInt(a2);
}
catch(NumberFormatException e)
{
System.out.println(a2 + " is not a valid integer");
}
while(a!=0)
{
r=a%10;
a1=(a1*10)+r;
a=a/10;
}
System.out.println(a1);
}
}