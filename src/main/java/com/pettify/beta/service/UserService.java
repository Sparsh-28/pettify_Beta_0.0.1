package com.pettify.beta.service;

import com.pettify.beta.businessbean.UserBean;

public interface UserService {
	
	int signUp(UserBean user) throws Exception;
	
	UserBean getUserDetailByUserId(int userId) throws Exception;
	
	UserBean deleteUser(int userId) throws Exception;

}
