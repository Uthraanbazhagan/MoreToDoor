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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.ProductDao;
import com.lti.entity.Category;
import com.lti.entity.Product;



		@RestController
		public class SearchController {

			@Autowired
			private ProductDao dao;

			@RequestMapping(path = "/search", method=RequestMethod.POST)
			public List<Product> fetch(@RequestBody Product product,HttpServletRequest request) {
				List<Product> list=dao.fetchByDesc(product);

				for(Product productt : list) {
					Path srcfile = Paths.get("D:/more2doorimg/"+productt.getProdPicFilename());
					Path destfile = Paths.get("src/main/resources/static/uploads/" + productt.getProdPicFilename());
					try {
						Files.copy(srcfile, destfile, StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
			return list;
			}
		}




