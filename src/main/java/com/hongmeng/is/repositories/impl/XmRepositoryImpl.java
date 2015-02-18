package com.hongmeng.is.repositories.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hongmeng.is.common.bo.TXm;
import com.hongmeng.is.repositories.XmRepository;

@Repository("xmRepository")
public class XmRepositoryImpl extends HmBaseRepositoryImpl<TXm> implements XmRepository {

	private static final Logger logger = LoggerFactory
			.getLogger(XmRepositoryImpl.class);
	
	@SuppressWarnings("static-access")
	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return this.logger;
	}

	
}
