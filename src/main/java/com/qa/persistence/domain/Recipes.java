
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
public class Recipes {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long RecipeID;
	@Column(length = 10)
	private String RecipeType;
	@Column(length = 10)
	private String DietryInformation;
	@Column(length = 10)
	private int EstimatedPreparationTime;
	@Column(length = 10)
	private int ServingSize;
	@Column(length = 10)
	private String RecipeInstructions;	
	@JoinColumn(name ="RecipeID", referencedColumnName = "RecipeID")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Reviews> reviews;
	
	public Recipes() {
	}

	public Recipes(Long recipeID, String recipeType, String dietryInformation,
			int estimatedPreparationTime, int servingSize, String recipeInstructions) {
		super();
		this.RecipeID = recipeID;
		this.RecipeType = recipeType;
		this.DietryInformation = dietryInformation;
		this.EstimatedPreparationTime = estimatedPreparationTime;
		this.ServingSize = servingSize;
		this.RecipeInstructions = recipeInstructions;
	}

	public Long getRecipeID() {
		return RecipeID;
	}

	public void setRecipeID(Long recipeID) {
		RecipeID = recipeID;
	}

	public String getRecipeType() {
		return RecipeType;
	}

	public void setRecipeType(String recipeType) {
		RecipeType = recipeType;
	}

	public String getDietryInformation() {
		return DietryInformation;
	}

	public void setDietryInformation(String dietryInformation) {
		DietryInformation = dietryInformation;
	}

	public int getEstimatedPreparationTime() {
		return EstimatedPreparationTime;
	}

	public void setEstimatedPreparationTime(int estimatedPreparationTime) {
		EstimatedPreparationTime = estimatedPreparationTime;
	}

	public int getServingSize() {
		return ServingSize;
	}

	public void setServingSize(int servingSize) {
		ServingSize = servingSize;
	}

	public String getRecipeInstructions() {
		return RecipeInstructions;
	}

	public void setRecipeInstructions(String recipeInstructions) {
		RecipeInstructions = recipeInstructions;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
}
