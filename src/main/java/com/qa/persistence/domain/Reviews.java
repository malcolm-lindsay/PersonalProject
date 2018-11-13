package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	//	composite primary key

	private int recipeID;
	private int userID;

	private String review;
	private int yearOfReview;
	private Long rating; 
	public Reviews() {

	}

	public Reviews(int yearOfReview, int recipeID, int userID,String review) {
		this.yearOfReview = yearOfReview;
		this.recipeID= recipeID;
		this.userID = userID;
		this.review = review;
		
	}
}


