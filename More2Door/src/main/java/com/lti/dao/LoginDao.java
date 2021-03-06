package com.lti.dao;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;
	import org.springframework.stereotype.Repository;

import com.lti.entity.User;
import com.lti.entity.UserDTO;

	@Repository
	public class LoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public User fetchByEmail(UserDTO userDTO) {
	MyCartDao dao=new MyCartDao();
	Query q = entityManager.createQuery("select a from User as a where a.email=:em");
	q.setParameter("em", userDTO.getEmail());
	User udto=(User)q.getSingleResult();
	if(udto.getPassword().equals(userDTO.getPassword()))
		return udto;
	else
		return null;
	
	}


	}



