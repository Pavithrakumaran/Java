package pavi;
import java.util.Scanner;
class DivThread extends Thread
{
	Scanner s=new Scanner(System.in);
	int a=1;
	public void run()
	{
    while(a<=10)
    {double sum= 0.0,i;
	System.out.println("Enter the number:");
	int x=s.nextInt();
	for(i=1.0;i<100000;i++)
	{
	sum=sum+1.0/i;
	if(sum > x)
	{
	System.out.println("The n value is: "+i);
	break;
	}
	}
	a++;
	}
	}
}
public class Divergence {
public static void main(String args[])
{
	DivThread dt=new DivThread();
	Thread th=new Thread(dt,"");
	System.out.println(th.getName());
	th.start();
	
}
}
OUTPUT:
Enter the number:
1
The n value is: 2.0
Enter the number:
2
The n value is: 4.0
Enter the number:
3
The n value is: 11.0
Enter the number:
4
The n value is: 31.0
Enter the number:
5
The n value is: 83.0
Enter the number:
6
The n value is: 227.0
Enter the number:
7
The n value is: 616.0
Enter the number:
8
The n value is: 1674.0
Enter the number:
9
The n value is: 4550.0
Enter the number:
10
The n value is: 12367.0

