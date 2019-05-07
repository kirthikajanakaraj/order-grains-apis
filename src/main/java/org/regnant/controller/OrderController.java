package org.regnant.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.regnant.bean.LoginBean;

import org.regnant.bean.OrderHistoryBean;
import org.regnant.bean.ProductBean;
import org.regnant.service.LoginService;
import org.regnant.service.OrderService;

@Path("/orderhistroy")
public class OrderController {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void getorderhistory(OrderHistoryBean user,@Context HttpServletRequest request)throws ClassNotFoundException, SQLException {
		//HttpSession session = request.getSession();
		//session.setAttribute(user.getEmail(), user);
		OrderService.OrderHistoryService(user);
	}
}