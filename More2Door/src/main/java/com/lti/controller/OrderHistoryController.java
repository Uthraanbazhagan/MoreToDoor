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
import com.lti.dao.OrderHistoryDao;
import com.lti.entity.MyCart;
import com.lti.entity.OrderHistory;
import com.lti.entity.OrderHistoryDTO;
import com.lti.entity.ProductDTO;

@RestController
public class OrderHistoryController {
	
	@Autowired
	private OrderHistoryDao dao;

	@RequestMapping(path = "/myOrder", method=RequestMethod.POST)
	public List<OrderHistory> fetch(@RequestBody  OrderHistoryDTO orderHistoryDTO,HttpServletRequest request) {
		List<OrderHistory> list=dao.fetchAll(orderHistoryDTO);
		
		return list;
	}
}
