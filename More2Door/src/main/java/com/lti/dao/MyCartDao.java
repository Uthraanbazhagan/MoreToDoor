package com.lti.dao;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;


	import org.springframework.stereotype.Component;
	import org.springframework.stereotype.Repository;

import com.lti.entity.MyCart;

	

	@Repository
	public class MyCartDao{
		
		@PersistenceContext
		private EntityManager em;
		
		
		public List<MyCart> fetchAll(){
			List<MyCart> myCart=em.createQuery("select  c from MyCart as c ").getResultList();
			return myCart;

}
	}
