package com.lti.controller;

	import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;


	@RestController
	public class ProductController {

		@Autowired
		private ProductDao dao;

		@RequestMapping(path = "/products", method=RequestMethod.POST)
		public List<Product> fetch(HttpServletRequest request) {
			List<Product> list=dao.fetchall();

			for(Product product : list) {
				Path srcfile = Paths.get("D:/more2doorimg/"+product.getProdPicFilename());
				Path destfile = Paths.get("src/main/resources/static/uploads/" + product.getProdPicFilename());
				try {
					Files.copy(srcfile, destfile, StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		return list;
		}
	}


