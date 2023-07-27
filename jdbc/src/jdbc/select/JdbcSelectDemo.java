package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo 
{
	public static void main(String[]args) {
		try {
			//LOAD DRIVER CLASS

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//OPEN CONNECTION
			Connection connection = DriverManager.getConnection
					          ("jdbc:mysql://localhost:3306/weja1?","root","root");
			//CREATE STATEMENT
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from student");
			
			//process resultset
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"||"+
			                       resultSet.getString(2));
			}
			connection.close();
			statement.close();
			resultSet.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	

}
