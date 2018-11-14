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
import com.qa.service.business.ReviewService;

@Path("/Recipes")
public class RecipesEndpoint {
	
	@Inject 
	private RecipeService service; 
	
	
	@Path("/getAllRecipes")
	@GET
	@Produces({ "application/json" })
	public String getAllRecipes() {
		return service.getAllRecipes();

		
//	@Path("/createRecipe")
//	@POST
//	@Produces({ "application/json" })
//	String createRecipe(String recipe) {
//		return service.createRecipe(recipe);
//	}	
//		

//	String updateRecipe(Long recipeID, String newRecipe);
//
//	String deleteRecipe(Long recipeID);

}
}