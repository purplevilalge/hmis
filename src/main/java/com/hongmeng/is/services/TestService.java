package com.hongmeng.is.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hongmeng.is.models.DmSex;
import com.hongmeng.is.repositories.TestRepository;


@Service
@Transactional
public class TestService {
	
    @Autowired    
	private TestRepository testRepository ;
	
	public List<DmSex> getDmSexAll() {
		
		return testRepository.getDmSexAll() ;
	}
}
