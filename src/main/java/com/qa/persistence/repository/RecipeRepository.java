package com.qa.persistence.repository;

public interface RecipeRepository {

	String getAllRecipes();

	String createRecipe(String recipe);

	String updateRecipe(Long recipeID, String newRecipe);

	String deleteRecipe(Long recipeID);

	//method for searching recipes, possibly methods to search by the properties such as dietry requirements
}