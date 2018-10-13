package pavi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c;
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/logdet","root","");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("SELECT * FROM login");
			System.out.println("Enter the username");
			Scanner s1=new Scanner(System.in);
			String un=s1.next();
			System.out.println("Enter the password");
			String pwd=s1.next();
			int flag=0;
			while(rs.next())
			{
				String un1=rs.getString(3);
				String pwd1=rs.getString(4);
				if(un.equals(un1))
				{
					if(pwd.equals(pwd1))
						flag=1;
				}
			}
			if(flag==1)
				System.out.println("Login Success");
			else
				System.out.println("Login Failed");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
OUTPUT:
Enter the username
pavi
Enter the password
pavi
OUTPUT:
Login Failed
Enter the username
pavi
Enter the password
pavi32
Login Success

