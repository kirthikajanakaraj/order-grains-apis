package org.regnant.controller;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.regnant.bean.ProductBean;
import org.regnant.service.CheckoutService;

@Path("/checkout")
public class CheckoutController
{
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({ MediaType.APPLICATION_JSON })
	public String checkoutlist(ProductBean[] pb) throws ClassNotFoundException, SQLException
	{
		 CheckoutService.addfinallist(pb);
		 
		 return "sucessfully order placed";
	}
	
}
