package ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.expense.model.RevUser;

public class connectionUtil {

	public static Connection getNewConnection(List<RevUser> revusers) throws SQLException{
		
		try (Connection conn = DriverManager.getConnection(
					System.getenv("db_url"), 
					System.getenv("db_user"),
					System.getenv("db_password")
					)) {
			conn.setAutoCommit(false);
			
			return conn;
		}
	}

}
