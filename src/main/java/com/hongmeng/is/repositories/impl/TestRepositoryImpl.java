package com.hongmeng.is.repositories.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hongmeng.is.models.DmSex;
import com.hongmeng.is.repositories.TestRepository;

@Repository("testRepository")
public class TestRepositoryImpl extends HibernateDaoSupport implements TestRepository {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
//    @Autowired
//    private SessionFactory sessionFactory;  
	
	@Override
	public List<DmSex> getDmSexAll() {
//
//		Session session = sessionFactory.getCurrentSession() ;
//
////		session.beginTransaction() ;
//		
//		List<DmSex> list = session.createQuery("from DmSex").list();
//		
////		session.getTransaction().commit() ;
		
//		this.getHibernateTemplate().getSessionFactory().getCurrentSession().beginTransaction() ;
		
		List<DmSex> list = this.getHibernateTemplate().loadAll(DmSex.class) ;
		
//		this.getHibernateTemplate().getSessionFactory().getCurrentSession().getTransaction().commit(); 
		
		return list ;
		
	}

}
