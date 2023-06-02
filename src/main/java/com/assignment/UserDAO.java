package com.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

import com.assignment.DbUtil;
import com.assignment.models.User;


public class UserDAO {
	
	private Connection connection;
	
	public UserDAO(ServletContext ctx){
		connection = DbUtil.getConnection(ctx);
		System.out.println(connection);
	}
	
	public String updateUserProfile(String name, String gender, String userId) {
		String status = "failed";
		try {
			
        	PreparedStatement stmt = connection.prepareStatement("UPDATE users SET fullname=?, gender=? WHERE id=?");
        	stmt.setString(1, name);
        	stmt.setString(2, gender);
        	stmt.setInt(3, Integer.parseInt(userId));
        	stmt.executeUpdate();
        	status="updated";
           
		}
		catch (SQLException e) {
			status="failed";
			e.printStackTrace();
		}
		return status;
	}
	
	public String changePassword(String username, String oldPass, String newPass) {
		String status = "invalid";
		try {
			Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username='"+username+"' AND password='"+oldPass+"'");
            if(rs.next()) {
            	PreparedStatement stmt = connection.prepareStatement("UPDATE users SET password=? where username=?");
            	stmt.setString(1, newPass);
            	stmt.setString(2, username);
            	stmt.executeUpdate();
            	status="changed";
            }
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
	public User getUserByUserId(String userId) {
		try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE id='"+Integer.parseInt(userId)+"'");
            rs.next();
            return new User(rs.getInt("id"), rs.getString("username"), rs.getString("fullname"), rs.getString("gender"), rs.getString("mobile"), rs.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}
	
	public User getUserByUsername(String username) {
		try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
            rs.next();
            return new User(rs.getInt("id"), rs.getString("username"), rs.getString("fullname"), rs.getString("gender"), rs.getString("mobile"), rs.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}
	
	public String loginUser(String username, String password) {
		String status = "invalid";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'");
			if(rs.next()) {
				status = "valid";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String registerUser(User user, String password) {
		String status = "exists";
		try {
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username='"+user.getUsername()+"'");
			if(!rs.next()) {
				PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(username, password, gender, fullname, email, mobile) VALUES (?, ?, ?, ?, ?, ?)");
				preparedStatement.setString(1, user.getUsername());
	            preparedStatement.setString(2, password);
	            preparedStatement.setString(3, user.getGender());
	            preparedStatement.setString(4, user.getFullName());
	            preparedStatement.setString(5, user.getEmail());
	            preparedStatement.setString(6, user.getMobileNo());
	            preparedStatement.executeUpdate();
	            status = "registered";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
}
