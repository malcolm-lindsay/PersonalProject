package com.qa.service.business;

public interface RecipeService {

	String getAllRecipes();

	String createRecipe(String recipe);

	String updateRecipe(Long recipeID, String newRecipe);

	String deleteRecipe(Long recipeID);

	//method for searching recipes, possibly methods to search by the properties such as dietry requirements

}