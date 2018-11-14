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
import com.qa.util.JSONUtil;


public class UserDBRepository implements UserRepository {

	@Override
	public String getAllUsers() {
		// TODO Auto-generated method stub
		return null;
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
	public String deleteUser(Long userID) {
		// TODO Auto-generated method stub
		return null;
	}
}


