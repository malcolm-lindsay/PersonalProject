package com.qa.persistence.repository;

public interface ReviewRepository {

	String getAllReviews();

	String createReview(String review);
		
	String deleteReview(Long reviewID);

	String EditReview(Long reviewID, String updatedReview);

}