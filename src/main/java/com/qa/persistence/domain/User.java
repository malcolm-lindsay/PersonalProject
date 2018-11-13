package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userID")
	private Long userID;
	private String firstName;
	private String secondName;
	private String DietryRequirements;
	private String Country;
	private String City;
	private String EmailAddress;
	private int yearOfBirth;
	
	
	public User() {

	}

	public User(Long userID, String firstName, String secondName, String dietryRequirements,
			String country, String city, String emailAddress, int yearOfBirth) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.secondName = secondName;
		DietryRequirements = dietryRequirements;
		Country = country;
		City = city;
		EmailAddress = emailAddress;
		this.yearOfBirth = yearOfBirth;
	}
	
	//methods for user
	
}
