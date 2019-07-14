package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.Product;

@Component("product")
public class AddProductDao {
@PersistenceContext
private EntityManager entityManager;
@Transactional
public void productAdd(Product product) {
	entityManager.merge(product);
}
}
