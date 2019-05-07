package org.regnant.service;

import java.sql.SQLException;

import org.regnant.bean.ProfileBean;
import org.regnant.bean.UserBean;
import org.regnant.dao.UserDAO;

public class ProfileService 
{

	public static ProfileBean getuserdetails(String email) throws ClassNotFoundException, SQLException
	{
		return UserDAO.getuser(email);
		
		
	}

	

}
