package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.MyCart;
import com.lti.entity.Product;

@Repository
public class MyCartDao {

	@PersistenceContext
	private EntityManager em;

	public List<MyCart> fetchAll() {
		Query q = em.createQuery("select  c from MyCart as c where c.user.userId = :id");
		q.setParameter("id", 222);
		return q.getResultList();
	}
}
