package com.pettify.beta.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pettify.beta.businessbean.UserBean;
import com.pettify.beta.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/signUp", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_HTML_VALUE)
	
	public ResponseEntity<String> signUp(@RequestBody UserBean userBean) throws Exception{
		int id = userService.signUp(userBean);
		return new ResponseEntity<String>("User Registration is Successful with User ID: "+id, 
				HttpStatus.CREATED);	
	}
	
	@RequestMapping(value="/user/:id/{id}", method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<UserBean> getUserDetailByUserId(@PathVariable("id") int userId) 
			throws Exception{
		
		UserBean user = userService.getUserDetailByUserId(userId);
		if(user!=null) {
			return new ResponseEntity<UserBean>(user, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<UserBean>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/user/delete_user/{id}", method=RequestMethod.DELETE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<UserBean> deleteUser(@PathVariable("id") int userId) throws Exception{
		
		UserBean user =userService.deleteUser(userId);
		if(user==null) {
			return new ResponseEntity<UserBean>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<UserBean>(user, HttpStatus.OK);
		}
	}
}
