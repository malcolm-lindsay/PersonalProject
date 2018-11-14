package com.qa.service.business;

public interface UserService {

	String getAllUsers();

	String addUser(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth);

	String updateUser(Long id);

	String deleteUser(Long id);

}