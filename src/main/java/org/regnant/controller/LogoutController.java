package org.regnant.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.regnant.bean.LoginBean;
import org.regnant.bean.ProductBean;
@Path("/logout")
public class LogoutController {
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public void logoutcontroller(LoginBean user, @Context HttpServletRequest request)
	  {
	  HttpSession session = request.getSession();

	  if (session != null) {
	  session.invalidate();
	  }

	  }
}
