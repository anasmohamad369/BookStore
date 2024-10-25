package bookstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBook {
	 public static void updateBook(Connection con, Double newprice,int id) throws SQLException{
		
		 String query = "update boook set book_price =? where book_id=?";
		 PreparedStatement ps = con.prepareStatement(query);
		 ps.setDouble(1, newprice);
		 ps.setInt(2, id);
		 ps.execute();
				 
	}
}
