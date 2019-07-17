package com.lti.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;


	@RestController
	public class ProductController {

		@Autowired
		private ProductDao dao;

		@RequestMapping(path = "/products")
		public List<Product> fetch() {
			List<Product> list=dao.fetchall();
		return list;
		}
	}


