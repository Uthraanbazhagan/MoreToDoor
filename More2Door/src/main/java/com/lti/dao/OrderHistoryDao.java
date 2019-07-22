package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.OrderHistory;
import com.lti.entity.OrderHistoryDTO;

@Repository
public class OrderHistoryDao {
	@PersistenceContext
	private EntityManager em;
	
	
	@Transactional
	public List<OrderHistory> fetchAll(OrderHistoryDTO orderHistoryDTO) {
		
		Query q = em.createQuery("select oh from OrderHistory as oh where oh.user.userId = :id");
	//	q.setParameter("id",orderHistoryDTO.getUserId());
		q.setParameter("id",222);
		return q.getResultList();		
	}

}
