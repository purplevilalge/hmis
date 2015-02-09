package com.hongmeng.is.repositories;

import java.util.List;

import com.hongmeng.is.models.CustomerEmployee;
import com.hongmeng.is.models.DmSex;
import com.hongmeng.is.models.Project;

public interface TestRepository {

	List<DmSex> getDmSexAll() ;
	
	List<CustomerEmployee> getCustomerEmployeeAll() ;
	
	List<Project> getProjectAll() ;
}
