package com.shoppingcart.database.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.database.dao.UserDAO;
import com.shoppingcart.database.modal.User;



@Service
public class UserServiceImpl
implements UserService{
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	
	
	
	@Transactional
	public void addUser(User u){
		userDAO.addUser(u);
	}



	
		
	



	
	}

	
	


