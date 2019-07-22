package com.lti.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.lti.dao.LoginDao;
import com.lti.entity.User;
import com.lti.entity.UserDTO;



	@Service
	public class LoginService {
		
		@Autowired
		private LoginDao loginDao;
		
		public User userValid(UserDTO userDTO){
			return loginDao.fetchByEmail(userDTO);
			
		}
		

	}



