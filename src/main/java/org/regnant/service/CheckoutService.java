package org.regnant.service;

import java.sql.SQLException;

import org.regnant.bean.ProductBean;
import org.regnant.dao.CheckOutDAO;


public class CheckoutService {
	public static void addfinallist(ProductBean[] pb) throws ClassNotFoundException, SQLException {
		for (int i = 0; i < pb.length; i++) {
			ProductBean productBean = pb[i];
			CheckOutDAO.finalcheckoutlist(productBean);

		}

	}

}
