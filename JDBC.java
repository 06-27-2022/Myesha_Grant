package com.expense.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ConnectionUtil.connectionUtil;
public class JDBC {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		final String SQL = "select * from RevUser";
		try {
			conn = connectionUtil.getNewConnection(null);
			
			stmt = conn.createStatement();
			
			/*
			 * Store results
			 */
			set = stmt.executeQuery(SQL);
			
			while(set.next()) {
				
				RevUser revUser = new RevUser(
			set.getInt(1),
			set.getString(2),
			set.getString(3),
			set.getString(4),
			set.getString(5),
			set.getString(6),		
			set.getString(7));
			
			System.out.println(revUser);
			
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
				set.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} 
		
		return;
	}

}
