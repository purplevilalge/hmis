package com.hongmeng.is.repositories;

import java.util.List;

public interface HmBaseRepository<T> {
	/**
	 * 返回所有数据
	 * 
	 * @return
	 */
	public List<T> findAll() ;
	
	/**
	 * 根据实体id查找实体
	 * 
	 * @param id
	 * @return
	 */
	public T findById(Integer id) ;

}
