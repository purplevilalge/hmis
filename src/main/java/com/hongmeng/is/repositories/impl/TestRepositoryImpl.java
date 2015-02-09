package com.hongmeng.is.repositories.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hongmeng.is.repositories.TestRepository;

@Repository("testRepository")
public class TestRepositoryImpl extends HibernateDaoSupport implements TestRepository {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
}
