package org.regnant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.regnant.bean.ProductBean;




public class ProductDAO {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "1234");
		return con;
	}
	public static List<ProductBean> getProducts() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from ordergrains.productdetails");
		List<ProductBean> grainslist = new ArrayList<>();
		while (rs.next()) {
			String pid = rs.getString(1);
			String pic = rs.getString(2);
			String price = rs.getString(3);
			String pname = rs.getString(4);
			String specification = rs.getString(5);

			ProductBean productBean = new ProductBean(pid, pic, price, pname, specification);
			grainslist.add(productBean);
		}

		con.close();
		System.out.println(grainslist);
		return grainslist;
	}
	
	
	
	
	
	public static ProductBean getProductById(int id1) throws ClassNotFoundException, SQLException {
		String id=id1+"";
		System.out.println(id);
		Connection con = getConnection();
		ProductBean pb=null;
		PreparedStatement stmt = con.prepareStatement("select * from ordergrains.productdetails where pid=?");
		stmt.setString(1,id);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String pid = rs.getString(1);
			String pic = rs.getString(2);
			String price = rs.getString(3);
			String pname = rs.getString(4);
			String specfication = rs.getString(5);

			 pb=new ProductBean(pid,pic,price,pname,specfication);
		}
		
		con.close();
		return pb;
	}
}
	
	
	
	
	
	
	