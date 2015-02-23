package com.hongmeng.is.repositories.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hongmeng.is.common.bo.TXm;
import com.hongmeng.is.repositories.HmBaseRepository;

public abstract class HmBaseRepositoryImpl<T> extends HibernateDaoSupport implements HmBaseRepository<T> {

	abstract public Logger getLogger() ;
	
    private Class<T> entityClass;  
    
    /** 
     * 这个通常也是hibernate的取得子类class的方法 
     *  
     * @author "yangk" 
     * @date 2010-4-11 下午01:51:28 
     */  
    public HmBaseRepositoryImpl() {  
        Type genType = getClass().getGenericSuperclass();  
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();  
        this.entityClass = (Class<T>) params[0];  
    }  

    @Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
    
	@Override
	public List<T> findAll() {
		this.getLogger().debug("查询所有数据") ;

		return (List<T>) this.getHibernateTemplate().loadAll(this.entityClass) ;
		
	}
	
	@Override
	public T findById(Integer id) {
		
		return this.getHibernateTemplate().load(this.entityClass, id) ;
	}
}
