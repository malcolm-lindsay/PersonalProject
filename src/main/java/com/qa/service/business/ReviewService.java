package com.qa.service.business;

public interface ReviewService {

	String getAllReviews();

	String createReview(Long userID, Long recipeID, String review);
		
	String EditReview(Long userID, Long recipeID, String updatedReview);

	String deleteReview(Long userID, Long recipeID);
	
}