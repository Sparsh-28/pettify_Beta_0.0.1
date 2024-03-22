package com.pettify.beta.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pettify.beta.businessbean.UserBean;
import com.pettify.beta.entity.UserEntity;

@Repository
public class UserDAOWrapper {
	
	@Autowired
	private UserDAO userDAO;
	
	public Integer signUp(UserBean user){
		UserEntity userEntityBean = new UserEntity();
		BeanUtils.copyProperties(user, userEntityBean);
		UserEntity ue=  userDAO.save(userEntityBean);
		return ue.getId();	
	}
	
	public UserBean getUserDetailByUserId(int userId) {
		
		 UserEntity x= userDAO.findOne(userId);
		    UserBean user =null;
		    if(x!=null){
		    	user = new UserBean();		
				BeanUtils.copyProperties(x, user);
		    }
		return user;
		
	}
	
	public void deleteUser(int userId) {
		userDAO.delete(userId);
	}
	

}
