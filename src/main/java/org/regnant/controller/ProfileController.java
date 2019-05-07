package org.regnant.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.reganant.utils.constants;
import org.regnant.bean.ProfileBean;
import org.regnant.bean.UserBean;
import org.regnant.service.ProfileService;


@Path("/profile")
public class ProfileController 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ProfileBean Logincredentials( @Context HttpServletRequest request)
			throws ClassNotFoundException, SQLException {
		constants constobject=new constants();
		HttpSession session = request.getSession();
		String email=(String) session.getAttribute(constobject.EMAIL);
		System.out.println("EMAIL------>"+email);
		ProfileBean pb=	ProfileService.getuserdetails("ponkypandi@gmail.com");
		System.out.println(pb.getUsername());
		return pb;
		
		
	}

	   
}
