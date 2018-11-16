package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.service.business.UserService;

@Path("/Users")
public class UserEndpoint {

	@Inject 
	private UserService service; 
	
	@Path("/getAllUsers")
	@GET
	@Produces({ "application/json" })
	public String getAllUsers() {
		return service.getAllUsers();
	}
	
	@Path("/addUser")
	@POST
	@Produces({ "application/json" })
	public String addUser(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth) {
		return service.addUser(userID, firstName, secondName, dietryRequirements,country, city, emailAddress, yearOfBirth);
	}
	
//	{ 
//	"userID" : 1, 
//	"firstName": Joseph, 
//	"secondName": Ware,
//	"dietryRequirements": Vegan, 
//	"country": UK, 
//	"city": Shepton Mallet, 
//	"emailAddress": saddfsdf, 
//	"yearOfBirth": 1994)  
//	}



	
	
	
	@Path("/deleteUser/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteser(@PathParam("userID") Long userID) {
		return service.deleteUser(userID);
	}
	 
	
//	String updateUser(Long userID);

	
	
}
