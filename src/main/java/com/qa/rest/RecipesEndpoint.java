package com.qa.rest;
import javax.validation.Valid;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.service.business.RecipeService;

@Path("/Recipes")
public class RecipesEndpoint {
	
	@Inject 
	private RecipeService service; 
	
	
	@Path("/getAllRecipes")
	@GET
	@Produces({ "application/json" })
	public String getAllRecipes() {
		return service.getAllRecipes();
	}
	
	@Path("/createRecipe")
	@POST
	@Produces({ "application/json" })
	public String createReview(String recipe) {
		return service.createRecipe(recipe);
	}
	
	@Path("/deleteRecipe/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteRecipe(@PathParam("recipeID") Long recipeID) {
		return service.deleteRecipe(recipeID);
	}
		

//	String updateRecipe(Long recipeID, String newRecipe);
//

}
