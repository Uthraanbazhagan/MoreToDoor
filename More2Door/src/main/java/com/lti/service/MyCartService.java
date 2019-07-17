package com.lti.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.lti.dao.MyCartDao;
import com.lti.entity.MyCart;

	
	@Service
	public class MyCartService {
		
		@Autowired
		MyCartDao myCartDao;
		
		public List<MyCart> add() {
		List<MyCart> list= myCartDao.fetchAll() ;
		return list;

	}
	}


