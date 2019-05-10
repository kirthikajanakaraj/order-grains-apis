package org.regnant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.regnant.bean.OrderHistoryBean;
import org.regnant.bean.ProductBean;

public class OrderDAO {

	public static void placeOrder(OrderHistoryBean ob) throws ClassNotFoundException, SQLException {

		Connection con = ProductDAO.getConnection();


		String order_id = ob.getOrder_id();
		String user_id = ob.getUser_id();
		String total_amount = ob.getTotal_amount();
		String delivery_date = ob.getDelivery_date();

		String sql = "INSERT INTO ordergrains.ordertable(user_id,order_id,total_amount,delivary_date,start_date)VALUES(?,?,?,?,"+"localtimestamp"+");";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, order_id);
		pstmt.setString(2, user_id);
		pstmt.setString(3, total_amount);
		pstmt.setString(4, delivery_date);
		pstmt.executeUpdate();

		for (int i = 0; i < ob.getProducts().length; i++) {
			String sqlquery1 = "INSERT INTO ordergrains.orderproductstable(order_id, product_id)VALUES('"
					+ ob.getOrder_id() + "', '" + ob.getProducts()[i] + "');";
			PreparedStatement stmt = con.prepareStatement(sqlquery1);
			stmt.executeUpdate();
		}
	}

}
