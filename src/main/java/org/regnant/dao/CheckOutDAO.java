package org.regnant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.regnant.bean.ProductBean;


public class CheckOutDAO {

	public static void finalcheckoutlist(ProductBean pb) throws ClassNotFoundException, SQLException {
		Connection con = ProductDAO.getConnection();
		System.out.println("kittikat--->"+pb.getPid());
		String sqlquery = "INSERT INTO ordergrains.checkouttable VALUES('" + pb.getPid() + "','" + pb.getPic() + "','"
				+ pb.getPrice() + "','" + pb.getPname() + "','" + pb.getSpecification() + "');";
		PreparedStatement pstmt = con.prepareStatement(sqlquery);
		pstmt.executeQuery();

	}

}
