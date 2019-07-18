package com.lti.more2door;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.dao.ProductDao;
import com.lti.entity.MyCart;
import com.lti.entity.Product;
import com.lti.service.MyCartService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)

public class More2DoorApplicationTests {
	@Autowired
	  ProductDao dao;

	@Autowired
	MyCartService service;
	
	
	@Test
	public void contextLoads() {
	}
	@Test
	public void fetch() {
		
		List<Product> products = dao.fetchall();
		for(Product product : products) {
			System.out.println(product.getProdId());
			System.out.println(product.getProdBrand());
			System.out.println(product.getProdDesc());
			System.out.println(product.getProdPrice());
			System.out.println(product.getProdQty());
			System.out.println(product.getProdLupdate());
			System.out.println(product.getProdPicFilename());			
		}	
	}
	
	@Test
	public void fetchMyCart() {
		List<MyCart> myCart= service.add();
		for(MyCart mc: myCart) {
			System.out.println(mc.getCartId());
			System.out.println(mc.getQty());
			
			
		}
		
	}



}
