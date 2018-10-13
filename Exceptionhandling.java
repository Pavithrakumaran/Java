package pavi;

import java.util.Scanner;

public class Exceptionhandling {
public static void main(String args[])
{
try
{
System.out.println("Enter the number of inputs");
Scanner s=new Scanner(System.in);
String num=s.next();
int n=Integer.parseInt(num);
if(n<=0)
	throw new MyException("Number should be greater than zero");
System.out.println("Enter the inputs");
String inp="";
int input[]=new int[100];
int sum=0,avg;
for(int i=0;i<n;i++)
{
	inp=s.next();
	input[i]=Integer.parseInt(inp);
	sum=sum+input[i];
}
avg=sum/n;
System.out.println("The Sum is:"+sum);
System.out.println("The Average is:"+avg);
}
catch(MyException e)
{
System.out.println(e.getMessage());	
}
catch(NumberFormatException e)
{
System.out.println("Enter only Integer Values..."+e);	
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);	
}
}
}
class MyException extends Exception
{
MyException(String msg)
{
super(msg);	
}
}
Output:
Enter the number of inputs
0
Number should be greater than zero
Output:
Enter the number of inputs
-1
Number should be greater than zero
Output:
Enter the number of inputs
2
Enter the inputs
f
Enter only Integer Values: java.lang.NumberFormatException: For input string: "f"
Output:
Enter the number of inputs
3
Enter the inputs
1
2
3
The Sum is:6
The Average is:2

