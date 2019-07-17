package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Category;
import com.lti.entity.User;

@Repository
	public class RegisterDao {

		@PersistenceContext
		private EntityManager entityManager;
		
		public User save(User user) {
			User us=entityManager.merge(user);
			return us;
		}
		
}
