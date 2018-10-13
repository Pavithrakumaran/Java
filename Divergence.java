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
