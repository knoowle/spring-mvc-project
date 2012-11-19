package com.knoowle.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.knoowle.model.Account;
import com.knoowle.service.AccountService;

@Component("accountService")
public class AccountServiceImpl implements AccountService{

	private SessionFactory sessionFactory;
	
	@Override
	public void register(Account account) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(account);
		session.getTransaction().commit();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
