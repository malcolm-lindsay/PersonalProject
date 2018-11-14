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
import com.qa.persistence.domain.User;
import com.qa.util.JSONUtil;


public class UserDBRepository implements UserRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllUsers() {
		Query query = manager.createQuery("Select a FROM Users a");
		Collection<User> User = (Collection<User>) query.getResultList();
		return util.getJSONForObject(User);
	}
	
	@Override
	public String addUser(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth) {
		return null;
	}

	@Override
	public String updateUser(Long userID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional(REQUIRED)
	public String deleteUser(Long userID) {
		if (manager.find(Recipes.class, userID) != null) {
			manager.remove(manager.find(User.class, userID));
			return "{\"message\": \"User sucessfully deleted\"}";
		} else
			return "{\"message\": \"User not found\"}";
	}
	
	
}


