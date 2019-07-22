package com.lti.controller;

	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.entity.UserDTO;
import com.lti.service.LoginService;


		@RestController
	public class LoginController {
		
		@Autowired
		private LoginService loginService;
		
		@RequestMapping(path="/login", method=RequestMethod.POST)
		public User UserValidation(@RequestBody UserDTO userDTO){
			return loginService.userValid(userDTO);
		}

	}



