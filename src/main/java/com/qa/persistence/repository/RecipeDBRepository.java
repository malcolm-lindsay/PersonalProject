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

import com.qa.persistence.domain.User;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class RecipeDBRepository implements RecipeRepository {

	@Override
	public String getAllRecipes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRecipe(String recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateRecipe(Long recipeID, String newRecipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRecipe(Long recipeID) {
		// TODO Auto-generated method stub
		return null;
	}
}


