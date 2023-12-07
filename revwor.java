import java.io.*;
import java.util.*;
class revwor
{
public static void main(String args[])
{
String a;
int i,n;
Scanner s= new Scanner(System.in);
a=s.nextLine();
n=a.length();
for(i=n-1;i>=0;i--)
{
System.out.print(a.charAt(i));
}
}
}
