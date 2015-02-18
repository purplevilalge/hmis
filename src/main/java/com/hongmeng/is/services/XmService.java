package com.hongmeng.is.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hongmeng.is.common.bo.TXm;
import com.hongmeng.is.controllers.admin.ProjectController;
import com.hongmeng.is.repositories.XmRepository;

@Service
@Transactional
public class XmService extends HmBaseService<TXm> {
	
	private static final Logger logger = LoggerFactory
			.getLogger(ProjectController.class);

	
    @Autowired  
	private XmRepository xmRepository ;

	@Override
	public List<TXm> findAll() {
		// TODO Auto-generated method stub
		return xmRepository.findAll() ;
	}

	@Override
	public Logger getLogger() {
		return this.logger;
	}

    
}
