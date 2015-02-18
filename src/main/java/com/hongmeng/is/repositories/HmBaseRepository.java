package com.hongmeng.is.repositories;

import java.util.List;

public interface HmBaseRepository<T> {
	/**
	 * 返回所有数据
	 * 
	 * @return
	 */
	List<T> findAll() ;

}
