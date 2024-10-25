package bookstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class addbook {
	
	public static void insertvalues(Connection con, int id,String name,String author,double price) throws SQLException
	{
	
	String query = "insert into boook values(?, ?, ?, ?)";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1,   id);
    ps.setString(2, name);
    ps.setString(3, author);
    ps.setDouble(4, price);
    ps.executeUpdate();
	}

}
