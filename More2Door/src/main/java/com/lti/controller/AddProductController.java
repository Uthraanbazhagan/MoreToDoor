package com.lti.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;
import com.lti.entity.ProductDTO;
import com.lti.service.AddProductService;

@RestController
public class AddProductController {
	
	  @Autowired
	  private AddProductService addproduct; 
	  
	  @RequestMapping(path="/addproduct", method=RequestMethod.POST) 
	  public ProductDTO addProduct(ProductDTO productDTO) { 
			ProductDTO productdto=addproduct.register(productDTO);
			
			return productdto;

	  }
	 }