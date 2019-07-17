package com.lti.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.RegisterDao;
import com.lti.entity.User;
import com.lti.entity.UserDTO;


	@Service
	public class RegisterService {
		
		@Autowired
		private RegisterDao registerDao;
		
		@Transactional
		public UserDTO save(UserDTO userDTO) {
			//Copying the data from the DTO to entity 
			User user = new User();
			
			//user.setName(userDTO.getName());
			 user.setFirstname(userDTO.getFirstname());
			 user.setLastname(userDTO.getLastname());
			 user.setRole(userDTO.getRole());
			 user.setEmail(userDTO.getEmail());
			 user.setPhone(userDTO.getPhone());
			 user.setAddress(userDTO.getAddress());
			 user.setCity(userDTO.getCity());
			 user.setPassword(userDTO.getPassword());
			 user.setPincode(userDTO.getPincode());
			
			registerDao.save(user);
			return userDTO;
			
		}
		

		}

