package com.qa.service.business;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.ReviewDBRepository;

public class ReviewServiceImpl implements ReviewService {

	@Inject
	ReviewDBRepository repo; 
	
	@Override
	public String getAllReviews() {
		return repo.getAllReviews();
	}

	@Override
	public String createReview(Long userID, Long recipeID, String review) {
		return repo.createReview(userID, recipeID, review);
	}

	@Override
	public String EditReview(Long userID, Long recipeID, String updatedReview) {
		return repo.EditReview(userID, recipeID, updatedReview);
	}

	@Override
	public String deleteReview(Long userID, Long recipeID) {
		return repo.deleteReview(userID, recipeID);
	
	}
}
