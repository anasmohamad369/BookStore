package bookstore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadBook {
	
	public static void readBook(Connection con) throws SQLException {
		 String query = "select * from boook";
		 Statement stmnt = con.createStatement();
		 ResultSet rs = stmnt.executeQuery(query);
		 while(rs.next())
		 {
			 int id = rs.getInt(1);
			String bookname = rs.getString(2);
			String bookauthor = rs.getString(3);
			double price = rs.getDouble(4);	
			System.out.println("Book Id="+" "+id+" "+"Book name="+" "+
			bookname+" "+
			" Book author="+" "+bookauthor+" "+"Book price="+" "+price);
		 }
	}
}
