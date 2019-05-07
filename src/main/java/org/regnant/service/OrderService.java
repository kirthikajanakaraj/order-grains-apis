package org.regnant.service;

import java.sql.SQLException;
import java.util.List;

import org.regnant.bean.LoginBean;
import org.regnant.bean.OrderHistoryBean;
import org.regnant.bean.UserBean;
import org.regnant.dao.OrderDAO;
import org.regnant.dao.UserDAO;

public class OrderService 
{
//	public static List<CheckOutBean> OrderServicebaseon_id(LoginBean lb) throws ClassNotFoundException, SQLException 
//	{
//		return OrderDAO.getOrderHistory(lb.getEmail());
//	}
//	
	
	
	
	
	
	
	public static void OrderHistoryService(OrderHistoryBean ob) throws ClassNotFoundException, SQLException 
	{
		 OrderDAO.placeOrder(ob.getOrder_id(), ob.getUser_id(),ob.getTotal_amount(),ob.getStart_date(),ob.getDelivery_date(),ob.getProducts());
	}
}

