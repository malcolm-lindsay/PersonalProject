package com.qa.service.business;

public interface ReviewService {

	String getAllReviews();

	String createReview(String review);
		
	String EditReview(String updatedReview, Long reviewID);

	String deleteReview(Long reviewID);
	
}