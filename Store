package pavi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c;
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pavi","root","");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("SELECT * FROM studet");
			System.out.println("Select the column to be added: id=1 or name=2");
			Scanner s1=new Scanner(System.in);
			int a=s1.nextInt();
			System.out.println("Enter the value");
			while(rs.next())
			{
				if(a==1)
				al.add(rs.getString(1));
				if(a==2)
				al.add(rs.getString(2));
			    //System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(al);
	}
}
