package org.regnant.bean;

public class ProductBean {
	
	private String pid;
	private String pic;
	private String price;
	private String pname;
	private String specification;
	
	
	public ProductBean() {
	}
	public ProductBean(String pid, String pic, String price,String pname,String specification) {
		this.pid = pid;
		this.pname = pname;
		this.specification = specification;
		this.price = price;
		this.pic = pic;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	
}
