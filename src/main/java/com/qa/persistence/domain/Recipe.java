
package com.qa.persistence.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Recipe {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "recipeID")
	private Long RecipeID;
	@Column(length = 10)
	private String recipeName;
	@Column(length = 10)
	private String recipeType;
	@Column(length = 10)
	private String dietryInformation;
	@Column(length = 10)
	private int servingSize;

	
	@JoinColumn(name ="recipeID", referencedColumnName = "recipeID")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Review> reviews;
	
	public Recipe() {
	}

	public Recipe(String recipeName, String recipeType,
			int estimatedPreparationTime, int servingSize) {
		this.recipeName = recipeName;
		this.recipeType = recipeType;
		this.dietryInformation = dietryInformation;
		this.servingSize = servingSize;
	}

	public Long getRecipeID() {
		return RecipeID;
	}

	public void setRecipeID(Long recipeID) {
		RecipeID = recipeID;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeType() {
		return recipeType;
	}

	public void setRecipeType(String recipeType) {
		this.recipeType = recipeType;
	}

	public String getDietryInformation() {
		return dietryInformation;
	}

	public void setDietryInformation(String dietryInformation) {
		this.dietryInformation = dietryInformation;
	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}