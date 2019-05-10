package org.regnant.service;

import java.sql.SQLException;
import java.util.List;

import org.regnant.bean.LoginBean;
import org.regnant.bean.OrderHistoryBean;
import org.regnant.bean.UserBean;
import org.regnant.dao.OrderDAO;
import org.regnant.dao.UserDAO;

public class OrderService {

	public static void OrderHistoryService(OrderHistoryBean ob) throws ClassNotFoundException, SQLException {
		OrderDAO.placeOrder(ob);
	}
}
