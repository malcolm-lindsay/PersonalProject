package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import com.qa.persistence.domain.Reviews;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ReviewDBRepository implements ReviewRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllReviews() {
		Query query = manager.createQuery("Select a FROM Reviews a");
		Collection<Reviews> Reviews = (Collection<Reviews>) query.getResultList();
		return util.getJSONForObject(Reviews);
	}


	@Override
	public String createReview(Long userID, Long recipeID, String review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EditReview(Long userID, Long recipeID, String updatedReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteReview(Long userID, Long recipeID) {
		// TODO Auto-generated method stub
		return null;
	}

}


