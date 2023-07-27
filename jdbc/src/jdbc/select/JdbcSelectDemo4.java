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

public class JdbcSelectDemo4
{
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
	private static String DriverPath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/weja1";
	private static String filePath="D:\\WEJA1\\jdbc\\Resources\\db_info.properties";
	private static String query;
	
	public static void main(String[] args) 
	{
		try {
			Class.forName(DriverPath);
			fileReader =new FileReader(filePath);
			properties = new Properties();
			
			properties.load(fileReader);
			connection = DriverManager.getConnection(dburl,properties);
			statement = connection.createStatement();
			query = "select * from student";
			resultSet =statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+ "|" + 
			            resultSet.getString(2));
			}
			
		       
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
			}       if(statement !=null) {
				    try {
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}              if(fileReader !=null) {
				            try {
								fileReader.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
					   }
			}                  if(resultSet !=null) {
				               try {
								resultSet.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			}
		}
		
		
		
	}
	
	
	

	
}