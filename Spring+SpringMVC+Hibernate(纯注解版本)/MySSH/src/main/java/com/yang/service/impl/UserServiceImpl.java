package com.yang.service.impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yang.bean.User;
import com.yang.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public void register(User user){
		Session session = sessionFactory.openSession();
		Transaction trasaction = session.beginTransaction();
		session.save(user);
		trasaction.commit();
	}
	@Override
	public List<User> getUsers() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		List<User> list=query.list();
		return list;
	}

}
