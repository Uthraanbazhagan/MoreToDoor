package com.lti.controller;

	import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.web.bind.annotation.RequestBody;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RequestMethod;
		import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.MyCartDao;
import com.lti.entity.MyCart;
import com.lti.entity.MyCartDTO;
import com.lti.entity.Product;
import com.lti.entity.ProductDTO;
import com.lti.entity.UserDTO;



		@RestController
		public class MyCartController {

			@Autowired
			private MyCartDao dao;

			@RequestMapping(path = "/myCart", method=RequestMethod.POST)
			public List<MyCart> fetch(@RequestBody  ProductDTO productDTO,HttpServletRequest request) {
				List<MyCart> list=dao.fetchAll(productDTO);
				for(MyCart myCart : list) {
					Path srcfile = Paths.get("D:/more2doorimg/"+myCart.getProduct().getProdPicFilename());
					Path destfile = Paths.get("src/main/resources/static/uploads/" +myCart.getProduct().getProdPicFilename());
					try {
						Files.copy(srcfile, destfile, StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			return list;
			}
			@RequestMapping(path = "/myCartUpdate", method=RequestMethod.POST)
			public List<MyCart> update(@RequestBody MyCartDTO mycartDTO,HttpServletRequest request) {
			
				List<MyCart> list=dao.update(mycartDTO);
				for(MyCart myCart : list) {
					Path srcfile = Paths.get("D:/more2doorimg/"+myCart.getProduct().getProdPicFilename());
					Path destfile = Paths.get("src/main/resources/static/uploads/" +myCart.getProduct().getProdPicFilename());
					try {
						Files.copy(srcfile, destfile, StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			return list;
			}
			
			@RequestMapping(path = "/myCartDelete", method=RequestMethod.POST)
			public List<MyCart> delete(@RequestBody MyCartDTO mycartDTO,HttpServletRequest request) {
				
				List<MyCart> list=dao.delete(mycartDTO);
				for(MyCart myCart : list) {
					Path srcfile = Paths.get("D:/more2doorimg/"+myCart.getProduct().getProdPicFilename());
					Path destfile = Paths.get("src/main/resources/static/uploads/" +myCart.getProduct().getProdPicFilename());
					try {
						Files.copy(srcfile, destfile, StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			return list;
			}
			@RequestMapping(path = "/myCartAdd", method=RequestMethod.POST)
			public String Add(@RequestBody ProductDTO productDTO,HttpServletRequest request) {
			
				dao.add(productDTO);
				return "success";
			}
			
			
			
		}


