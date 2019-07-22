package com.lti.service;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;
import com.lti.entity.ProductDTO;

@Service
public class AddProductService {
	
	@Autowired
	private ProductDao productDao;
	
	//@Transactional
	public ProductDTO register(ProductDTO productDTO){
		//copying data from user to entity
		
		
		
		  String path1="d:/more2doorimg/"; 
		  String fileName1=productDTO.getProdBrand()+"_"+productDTO.getProductPic().getOriginalFilename(); 
		  String finalPath1=path1+fileName1;
		  
		  
		  
		  try { 
		  productDTO.getProductPic().transferTo(new File(finalPath1));
		  
		  }catch(IOException e) { 
			  e.printStackTrace(); 
			  }
		 
		
		
	Product product=new Product();
	product.setProdBrand(productDTO.getProdBrand());	
	product.setProdDesc(productDTO.getProdDesc());
	product.setProdLupdate(new Date());
	product.setProdPrice(productDTO.getProdPrice());
	product.setProdQty(productDTO.getProdQty());
	product.setProdPicFilename(fileName1);
		
        productDao.productAdd(product);
		
		return productDTO;
		
	}
}