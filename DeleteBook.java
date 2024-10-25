package bookstore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBook {
	
	public static void deleteBook(Connection con,int id) throws SQLException{
		String qur  =" delete from boook where book_id = ?";
		PreparedStatement ps = con.prepareStatement(qur);
		
		ps.setInt(1, id);
		ps.execute();
	}

}
