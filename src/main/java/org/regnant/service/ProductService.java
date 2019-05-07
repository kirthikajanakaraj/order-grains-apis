package org.regnant.service;

import java.sql.SQLException;
import java.util.List;

import org.regnant.bean.ProductBean;
import org.regnant.dao.ProductDAO;

public class ProductService {

	public ProductBean getProduct(int productId) throws ClassNotFoundException, SQLException {
		ProductBean pb = ProductDAO.getProductById(productId);

		return pb;
	}

	public List<ProductBean> getAllProducts() throws ClassNotFoundException, SQLException {
		List<ProductBean> products = ProductDAO.getProducts();
		return products;
	}
}
