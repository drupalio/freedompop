package com.freedompop.persons.bussiness.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.dao.IPersonsDAO;

@Component("personsServiceIntImpl")
public class PersonsServiceIntImpl  implements IPersonsServiceInt{
	
	@Autowired
	@Qualifier("personsDAO")
	private IPersonsDAO personsDAO;


	
	
}
