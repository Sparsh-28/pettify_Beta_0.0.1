package com.pettify.beta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettify.beta.businessbean.UserBean;
import com.pettify.beta.dao.UserDAOWrapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAOWrapper userDAOWrapper;
	
	
	public int signUp(UserBean user) throws Exception{
		int result = userDAOWrapper.signUp(user);
		return result;
	}
	
	
	public UserBean getUserDetailByUserId(int userId)throws Exception{
		return userDAOWrapper.getUserDetailByUserId(userId);
	}
	
	
	public UserBean deleteUser(int userId)throws Exception{
		
		UserBean user = userDAOWrapper.getUserDetailByUserId(userId);
		if(user!=null){
			userDAOWrapper.deleteUser(user.getId());
		}
		return user;
	}

	
}
