package org.regnant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.regnant.bean.OrderHistoryBean;
import org.regnant.bean.ProductBean;

public class OrderDAO {
//	public static List<CheckOutBean> getOrderHistory(String email) throws ClassNotFoundException, SQLException {
//
//		List<CheckOutBean> bean = new ArrayList<>();
//
//		Connection con = ProductDAO.getConnection();
//		PreparedStatement stmt = con.prepareStatement(
//				"select productid, productquantity, picname, price from ordergrains.orderhistory where emailid = ?;");
//		stmt.setString(1, email);
//		ResultSet rs = stmt.executeQuery();
//		while (rs.next()) {
//			String productname = rs.getString(1);
//			String productquantity = rs.getString(2);
//			String productImg = rs.getString(3);
//			String price = rs.getString(4);
//			CheckOutBean grains = new CheckOutBean(productname, productquantity, productImg, price);
//			bean.add(grains);
//		}
//		return bean;
//	}

	public static void placeOrder(String order_id, String user_id, String total_amount, String start_date,
			String delivery_date, String[] products) throws ClassNotFoundException, SQLException {

		Connection con = ProductDAO.getConnection();
		String sqlquery = "INSERT INTO ordergrains.ordertable(user_id, order_id, total_amount, start_date, delivery_date)VALUES('"
				+ order_id + "', '" + user_id + "','" + total_amount + "''" + start_date + "''" + delivery_date + "');";
		PreparedStatement pstmt = con.prepareStatement(sqlquery);
		pstmt.executeUpdate();

		for (int i = 0; i < products.length; i++) {
			String sqlquery1 = "INSERT INTO ordergrains.orderproductstable(order_id, product_id)VALUES('" + order_id
					+ "', '" + products[i] + "');";
			PreparedStatement stmt= con.prepareStatement(sqlquery1);
			stmt.executeUpdate();
		}
	}

//	public static void orderproductstable(String product_id, String order_id)
//			throws ClassNotFoundException, SQLException {
//
//		Connection con = ProductDAO.getConnection();
//		String sqlquery = "INSERT INTO ordergrains.ordertable VALUES('" + product_id + "','" + order_id + "','" + "');";
//		PreparedStatement pstmt = con.prepareStatement(sqlquery);
//		pstmt.executeUpdate();
//
//	}
}
