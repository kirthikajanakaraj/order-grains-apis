package org.regnant.bean;

public class OrderHistoryBean {
	private String order_id;
	private String user_id;
	private String total_amount;
	private String start_date;
	private String delivery_date;
	private String Products[];

	public OrderHistoryBean(String order_id, String user_id, String total_amount, String start_date,
			String delivery_date, String[] products) {

		this.order_id = order_id;
		this.user_id = user_id;
		this.total_amount = total_amount;
		this.start_date = start_date;
		this.delivery_date = delivery_date;
		Products = products;
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

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String[] getProducts() {
		return Products;
	}

	public void setProducts(String[] products) {
		this.Products = products;
	}

	public OrderHistoryBean() 
	{

	}

}
