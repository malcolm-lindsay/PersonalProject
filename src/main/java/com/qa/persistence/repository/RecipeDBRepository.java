package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Recipes;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class RecipeDBRepository implements RecipeRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllRecipes() {
		Query query = manager.createQuery("Select a FROM Recipe a");
		Collection<Recipes> recipes = (Collection<Recipes>) query.getResultList();
		return util.getJSONForObject(recipes);
	}
	
	@Override
	@Transactional(REQUIRED)
	public String createRecipe(String recipe) {
		Recipes aRecipe = util.getObjectForJSON(recipe, Recipes.class);
		manager.persist(aRecipe);
		return "{\"message\": \"Recipe has been successfully added\"}";
	}
	
	
	@Override
	public String updateRecipe(Long recipeID, String newRecipe) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	@Transactional(REQUIRED)
	public String deleteRecipe(Long recipeID) {
		if (manager.find(Recipes.class, recipeID) != null) {
			manager.remove(manager.find(Recipes.class, recipeID));
			return "{\"message\": \"Recipe sucessfully deleted\"}";
		} else
			return "{\"message\": \"Recipe not found\"}";
	}
	
		
}


