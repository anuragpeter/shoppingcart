package com.shoppingcart.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.shoppingcart.database.modal.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public void addUser(User u) {
		Session ss=sessionFactory.getCurrentSession();
		ss.persist(u);
		

	}

}
