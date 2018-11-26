
package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10)
	private Long reviewID;
	@Column(length = 10)
	private String nameOfRecipe;
	@Column(length = 10)
	private int yearOfReview;
	@Column(length = 10)
	private Long rating;
	
	@JoinColumn(name = "userID")
	private Long userID;
	@JoinColumn(name = "recipeID")
	private Long recipeID;

	
	public Review() {
	}

	public Review(int yearOfReview, String nameOfRecipe, long rating) {
		this.yearOfReview = yearOfReview;
		this.nameOfRecipe = nameOfRecipe;
		this.rating = rating;
	}

	public Long getReviewID() {
		return reviewID;
	}

	public void setReviewID(Long reviewID) {
		this.reviewID = reviewID;
	}

	public String getnameOfRecipe() {
		return nameOfRecipe;
	}

	public void setnameOfRecipe(String nameOfRecipe) {
		this.nameOfRecipe = nameOfRecipe;
	}

	public int getYearOfReview() {
		return yearOfReview;
	}

	public void setYearOfReview(int yearOfReview) {
		this.yearOfReview = yearOfReview;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Long getRecipeID() {
		return recipeID;
	}

	public void setRecipeID(Long recipeID) {
		this.recipeID = recipeID;
	}	
}

