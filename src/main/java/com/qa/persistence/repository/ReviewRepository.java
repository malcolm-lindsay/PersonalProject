package com.qa.persistence.repository;

public interface ReviewRepository {

	String getAllReviews();

	String createReview(Long userID, Long recipeID, String review);
		
	String EditReview(Long userID, Long recipeID, String updatedReview);

	String deleteReview(Long userID, Long recipeID);

}