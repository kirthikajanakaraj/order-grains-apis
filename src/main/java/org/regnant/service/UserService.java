package org.regnant.service;

import java.sql.SQLException;

import org.regnant.bean.UserBean;
import org.regnant.dao.UserDAO;

public class UserService {
	public static UserBean addUser(UserBean user) throws ClassNotFoundException, SQLException {
		return UserDAO.addUser(user);
	}
}
