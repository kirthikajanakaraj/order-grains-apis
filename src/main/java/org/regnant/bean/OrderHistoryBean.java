package org.regnant.bean;

import java.util.Arrays;

public class OrderHistoryBean {
	private String order_id;
	private String user_id;
	private String total_amount;
	private String delivery_date;
	private String products[];


	public OrderHistoryBean(String order_id, String user_id, String total_amount, String delivery_date,
			String[] products) {
		this.order_id = order_id;
		this.user_id = user_id;
		this.total_amount = total_amount;
		this.delivery_date = delivery_date;
		this.products = products;
	}


	public OrderHistoryBean() {
	}


	public String getOrder_id() {
		return order_id;
	}


	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getTotal_amount() {
		return total_amount;
	}


	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}


	public String getDelivery_date() {
		return delivery_date;
	}


	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}


	public String[] getProducts() {
		return products;
	}


	public void setProducts(String[] products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "OrderHistoryBean [order_id=" + order_id + ", user_id=" + user_id + ", total_amount=" + total_amount
				+ ", delivery_date=" + delivery_date + ", Products="
				+ Arrays.toString(this.products) + "]";
	}

	
}
