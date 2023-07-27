package jdbc.select;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelectDemo5 
{
	private static Connection connection;
	private static Statement statement;
	private static FileReader fileReader;
	private static ResultSet resultSet;
	private static Properties properties;
	private static String filePath = "D:\\WEJA1\\jdbc\\resources\\db_info.properties";
	
	public static void main(String[]args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery(properties.getProperty("query"));
			
		     while(resultSet.next()) {
		    	 System.out.println(resultSet.getInt(1) + "|" +  
		                            resultSet.getString(2)); 
		     } 
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
			if(connection !=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				if(statement !=null)
				{
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(resultSet !=null)
				{
					try {
						resultSet.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}}}}
