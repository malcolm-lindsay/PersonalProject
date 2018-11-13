package com.qa.persistence.repository;

public interface UserRepository {

	String getAllUsers();

	String createUser(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth);

	String updateUser(Long userID);

	String deleteUser(Long userID);

	//methods arguments need to be updated
	
}