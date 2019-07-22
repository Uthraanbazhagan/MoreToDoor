package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.MyCart;
import com.lti.entity.MyCartDTO;
import com.lti.entity.Product;
import com.lti.entity.ProductDTO;
import com.lti.entity.User;

@Repository
public class MyCartDao {

	@PersistenceContext
	private EntityManager em;
	@Transactional
	public List<MyCart> fetchAll(ProductDTO productDTO) {
		Query q = em.createQuery("select  c from MyCart as c where c.user.userId = :id");
		q.setParameter("id",productDTO.getUserId());
		return q.getResultList();
	}
 
	@Transactional
	public List<MyCart> update(MyCartDTO mycartDTO) {
		Query q=em.createQuery("update MyCart c set c.qty=:a where c.cartId=:b");
	    q.setParameter("a", mycartDTO.getQty());
	    q.setParameter("b",mycartDTO.getCartId());
		q.executeUpdate();
		ProductDTO productDTO=new ProductDTO();
	    productDTO.setUserId(mycartDTO.getUserId());
		
		
		return fetchAll(productDTO);
	}

	@Transactional
	public List<MyCart> delete(MyCartDTO mycartDTO) {
	    Query q=em.createQuery("delete from MyCart c where c.cartId=:a");
	    q.setParameter("a", mycartDTO.getCartId());
	    q.executeUpdate();
	    ProductDTO productDTO=new ProductDTO();
	    productDTO.setUserId(mycartDTO.getUserId());
		
		return fetchAll(productDTO);
	}
	
	@Transactional
	public void add(ProductDTO productDTO) 
	{
		Product p=new Product();
		p.setProdId(productDTO.getProdId());
		User user=new User();
		user.setUserId(productDTO.getUserId());
		MyCart mycart=new MyCart();
		mycart.setProduct(p);
		mycart.setQty(1);
		mycart.setUser(user);
		em.merge(mycart);
	}
	
	

	
}
