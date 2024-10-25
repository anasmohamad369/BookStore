package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutility {

	public static  Connection getConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/project";
		String username= "root";
		String password = "1016";
		
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		return con;
		
	}

	

}
