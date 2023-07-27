package jdbc.update;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUpdateDemo1{
	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath = "D:\\WEJA1\\jdbc\\resources\\db_info.properties";
	private static String query;
	
	public static void main(String []args) {
		try {
			fileReader = new FileReader(filePath);
			properties = new Properties();
			properties.load(fileReader);
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			statement = connection.createStatement();
			query = "update student "     
	                       + "set email = 'babaita14@gmail.com' " 
					       + "where id = 4";
			result = statement.executeUpdate(query);
			System.out.println("QUERY OK, " + result + "rows() affected");
			
		} catch (FileNotFoundException e) {
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
		} finally {
			if(connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}   if(statement !=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}     if(fileReader !=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 
	 }
}