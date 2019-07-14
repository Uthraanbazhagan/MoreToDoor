package com.lti.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.dao.AddProductDao;
import com.lti.entity.Product;
import com.lti.entity.ProductDTO;

@Controller
public class AddProductController {
	
	AddProductDao dao;
  static int i=0000;
	@RequestMapping("/addproduct.lti")
	public String addProduct(ProductDTO productDTO) {
	String path="d:/more2doorimg";
	String filename=productDTO.getProdBrand()+"-"+ productDTO.getProductPic().getOriginalFilename();
	String finalpath=path+filename;
	try {
	productDTO.getProductPic().transferTo(new File(finalpath));	
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	Product product=new Product();
	product.setProdId(productDTO.getProdBrand().substring(0,3)+i);
	i++;
	product.setProdBrand(productDTO.getProdBrand());
	product.setProdDesc(productDTO.getProdDesc());
	product.setProdQty(productDTO.getProdQty());
	product.setProdPrice(productDTO.getProdPrice());
	//product.setCategory(productDTO.getCatid());
	product.setProdLupdate(productDTO.getProdLupdate());
	System.out.println("remove after changes");
   dao.productAdd(product);
   return "dummy.html";
	
	}
}