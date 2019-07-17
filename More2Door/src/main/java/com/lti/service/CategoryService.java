package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CategoryDao;
import com.lti.entity.Category;


	@Service
	public class CategoryService {
		
		@Autowired
		private CategoryDao categoryDao;
		
		@Transactional
		public Category save(Category category) {
			Category updatedCategory = categoryDao.save(category);
			return updatedCategory;
		}
		

		}


