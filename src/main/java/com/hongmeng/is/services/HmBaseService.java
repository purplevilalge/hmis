package com.hongmeng.is.services;

import java.util.List;

import org.slf4j.Logger;

public abstract class HmBaseService<T> {

	public abstract List<T> findAll() ;
	
	public abstract Logger getLogger() ; 
}
