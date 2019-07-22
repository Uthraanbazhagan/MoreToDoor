package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lti.entity.Product;


@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void productAdd(Product product) {
	entityManager.merge(product);
	System.out.println("inserted succesfully");
	}

	public List<Product> fetchall(){
		List<Product> productList = entityManager.createQuery("SELECT productDetails from Product as productDetails").getResultList();
		return productList;
	}
	
	public List<Product> fetchByDesc(Product product){
		 Query q= entityManager.createQuery("SELECT p from Product as p where p.prodDesc like :desc ");
		q.setParameter("desc","%"+product.getProdDesc()+"%");
		 List<Product> productList=q.getResultList();
		 
		 
		 return productList;	
	}
	
	
}
