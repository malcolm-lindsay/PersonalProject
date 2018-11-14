package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.UserDBRepository;

public class UserServiceImpl implements UserService {
	
	@Inject
	UserDBRepository repo;

	@Override
	public String getAllUsers() {
		return repo.getAllUsers();
	}

	@Override
	public String addUser(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth)  {
		return repo.addUser(userID, firstName, secondName, dietryRequirements, country, city, emailAddress, yearOfBirth);
	}

	@Override
	public String updateUser(Long userID) {
		return repo.updateUser(userID);
	}

	@Override
	public String deleteUser(Long userID) {
		return repo.deleteUser(userID);		
	}
}
