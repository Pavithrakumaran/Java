package pavi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class NewIndiaCorporation {
	static void dbconn(String n,float hr,float bp,float sal)
	{try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c;
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement s=c.createStatement();
			s.execute("INSERT into empde values('"+n+"','"+hr+"','"+bp+"','"+sal+"')");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
float salary(float x,float y)
{
float sal = 0;
if(x<=40)
{
sal=x*y;	
}
if(x>40 && x<60)
{
	float a=x-40;
	int b=(int) (y*1.5);
sal=(int) ((40*y)+(a*b));
}
if(x>=60)
{
	System.out.println("Invalid working time");
}
return sal;
}
	public static void main(String[] args) {
		System.out.println("Enter employee name");
		Scanner s2=new Scanner(System.in);
		String n=s2.next();
		System.out.println("Enter employee working hour");
		float hr=s2.nextFloat();
		System.out.println("Enter employee basic pay");
		float bp=s2.nextFloat();
		NewIndiaCorporation nwi=new NewIndiaCorporation();
		if(hr>=60 && bp<50) {
			System.out.println("Invalid");
		}
		else {
		System.out.println("The Salary is:");
		float salary=nwi.salary(hr, bp);
		System.out.print(salary);
		dbconn(n,hr,bp,salary);
		//System.out.println(nwi.salary(47, 45));
		//System.out.println(nwi.salary(73, 100));
		}
	}
}
