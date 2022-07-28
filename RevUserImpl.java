package com.registration.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.expense.model.RevUser;
import ConnectionUtil.connectionUtil;

public class RevUserImpl implements RevUserRepo {
	
	//get all info from DB
	public List<RevUser> findAllRevUsers(List<RevUser> revuser2){
		
		//connection declaration
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		//declaring and initializing the list
		List<RevUser> revusers = new  ArrayList<>();
		
		final String SQL = "select * from revuser";
		
		try {
			//get connection
			conn = connectionUtil.getNewConnection(revusers);
			
			//execute sql stmts
			stmt = conn.createStatement();
			
			//ResultSet will store data
			set = stmt.executeQuery(SQL);
			
			while(set.next()) {
				
				RevUser revuser = new RevUser(
			set.getInt(1),
			set.getString(2),
			set.getString(3),
			set.getString(4),
			set.getString(5),
			set.getString(6),
			set.getString(7));
			
				//RevUser objects
				revuser.add(revuser);
			
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
		return revusers;
	}
	
	public void save(RevUser revuser) {
		Connection conn = null;
		
		//Inserting user input will protect against SQL injection
		PreparedStatement stmt = null;
		
		final String SQL = "insert into revusers values(default,?,?,?,?,?,?)";
		
		try {
				conn = connectionUtil.getNewConnection(null);
				stmt = conn.prepareStatement(SQL);
				
				stmt.setInt(1,revuser.getId());
				stmt.setString(2,revuser.getUsername());
				stmt.setString(3, revuser.getFirstName());
				stmt.setString(4, revuser.getLastName());
				stmt.setString(5, revuser.getEmail());
				stmt.setString(3, revuser.getPassword());
				stmt.setString(3, revuser.getRole());
				stmt.execute();
				
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				stmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	@Override
	public void update(RevUser revuser) {
		Connection conn = null;
		PreparedStatement stmt = null;
		final String SQL ="update revusers set username=? where id=?";
		
		try {
			conn = connectionUtil.getNewConnection(null);
			stmt=conn.prepareStatement(SQL);
			
			stmt.setInt(1, revuser.getId());
			stmt.setString(2,revuser.getUsername());
			stmt.execute();
			
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally {
		try {
			conn.close();
			stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
			
		
		}


	@Override
		public RevUser findById(int id) {
		
			RevUser revuser = null;
			
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet set = null;
			
			final String SQL = "Select * from revusers where id = ?";
			
			try {
				conn = connectionUtil.getNewConnection(null);
				stmt = conn.prepareStatement(SQL);
				stmt.setInt(1, id);
				set = stmt.executeQuery();
				
			if(set.next()) {
				revuser = new RevUser(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getString(4),
						set.getString(5),
						set.getString(6),
						set.getString(7)
						);
			}
			}catch(SQLException e) {
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
		return revuser;
	}

	public List<RevUser> findAllRevUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}