package pavi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	
	public static void main(String[] args) {
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c;
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/t1","root","");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("SELECT * FROM pavi");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
