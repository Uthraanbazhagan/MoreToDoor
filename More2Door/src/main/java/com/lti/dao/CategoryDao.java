package com.lti.dao;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Category;

@Repository
public class CategoryDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Category save(Category category) {
		category.setCatLupdate(new Date());
		return entityManager.merge(category);
	}

}
