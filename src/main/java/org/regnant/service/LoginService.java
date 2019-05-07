package org.regnant.service;

import java.sql.SQLException;

import org.regnant.bean.LoginBean;
import org.regnant.dao.UserDAO;

public class LoginService {

	public static boolean checkuser(LoginBean user) throws ClassNotFoundException, SQLException {
		return UserDAO.checkvaliduser(user);

	}

}
