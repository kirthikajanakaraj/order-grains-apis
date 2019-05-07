package org.regnant.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.reganant.utils.constants;
import org.regnant.bean.LoginBean;
import org.regnant.service.LoginService;


@Path("/login")
public class LoginController {
	String email = null;
	constants constobject=new constants();
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public LoginBean Logincredentials(LoginBean user, @Context HttpServletRequest request)
			throws ClassNotFoundException, SQLException {
		HttpSession session = request.getSession();
		if (LoginService.checkuser(user)) {
			session.setAttribute(constobject.EMAIL, user.getEmail());
		}
		return user;
	}

}
