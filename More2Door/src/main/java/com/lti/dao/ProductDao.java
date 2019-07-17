package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.Product;


@Component("product")
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
}
