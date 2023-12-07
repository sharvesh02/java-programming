import java.io.*;
import java.util.*;
class inp
{
public static void main(String args[])
{
String a,b;
int i,j,n1,n2,c=0;
Scanner s= new Scanner(System.in);
a=s.nextLine();
b=s.nextLine();
n1=a.length();
n2=b.length();
if(n1!=n2)
{
System.out.println("invalid user");
}
for(i=n1-1;i>=0;i--)
{
if(a.charAt(i)==b.charAt(i))
{
c++;
}
else
{
System.out.println("invalid user");
c=0;
break;
}
}
if(c!=0)
{
System.out.println("valid user");
}
}
}

