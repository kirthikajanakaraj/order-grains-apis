package org.regnant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.regnant.bean.LoginBean;
import org.regnant.bean.ProfileBean;
import org.regnant.bean.UserBean;

public class UserDAO {
	public static UserBean addUser(UserBean ub) throws ClassNotFoundException, SQLException {
		Connection con = ProductDAO.getConnection();
		String sql = "INSERT INTO ordergrains.userdata(username, \"password\", email, phone)VALUES(?,?,?,?);";
		System.out.println(ub.getEmail());
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, ub.getUsername());
		pstmt.setString(2, ub.getPassword());
		pstmt.setString(3, ub.getEmail());
		pstmt.setString(4, ub.getPhone());
		pstmt.executeUpdate();
		return ub;
	}

	public static boolean checkvaliduser(LoginBean user) throws ClassNotFoundException, SQLException {
		Connection con = ProductDAO.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select password from ordergrains.userdata where email='" + user.getEmail() + "';");
		String p = "";
		while (rs.next()) {
			p = rs.getString(1);
			System.out.println("to chesk status : " + p);
		}

		if (p.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	public static ProfileBean getuser(String email) throws ClassNotFoundException, SQLException 
	{
		ProfileBean pb=null;
		Connection con = ProductDAO.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from ordergrains.userdata where email='" + email + "';");
		while (rs.next()) {
			String username = rs.getString(1);
			String email1 = rs.getString(3);
			String phone = rs.getString(4);
			pb=new ProfileBean(username,email1,phone);
		}
		return pb;
		
	}
}


