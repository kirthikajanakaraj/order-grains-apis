package org.regnant.controller;

import java.sql.SQLException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.regnant.bean.UserBean;
import org.regnant.service.UserService;

@Path("/userregistration")
public class UserController {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void createUser(UserBean details) throws ClassNotFoundException, SQLException {
		UserService.addUser(details);
	}

}
