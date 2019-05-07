package org.regnant.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.regnant.bean.ProductBean;
import org.regnant.service.ProductService;


@Path("/products")
public class ProductController {
	
	ProductService productService=new ProductService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<ProductBean> getProducts() throws ClassNotFoundException, SQLException
	{
		
		List<ProductBean> listOfCountries=productService.getAllProducts();
		return listOfCountries;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public ProductBean getProductById(@PathParam("id") int id) throws ClassNotFoundException, SQLException
	{
		return productService.getProduct(id);
	}
   
	
}
