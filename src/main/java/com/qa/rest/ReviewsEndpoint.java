package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.service.business.ReviewService;
import com.qa.service.business.UserService;

@Path("/Reviews")
public class ReviewsEndpoint {
	
	@Inject 
	private ReviewService service; 
	
	
	@Path("/getAllReviews")
	@GET
	@Produces({ "application/json" })
	public String getAllReviews() {
		return service.getAllReviews();
	}
	
	@Path("/createReview")
	@POST
	@Produces({ "application/json" })
	public String createReview(Long userID, Long recipeID, String review) {
		return service.createReview(userID, recipeID, review);
	}
	
	@Path("/deleteUser/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteReview(@PathParam("userID") Long userID) {
		return service.deleteReview(userID, userID);
	}

//	String getAllReviews();
//
//	String createReview(Long userID, Long recipeID, String review);
//		
//	String EditReview(Long userID, Long recipeID, String updatedReview);
//
//	String deleteReview(Long userID, Long recipeID);

}
