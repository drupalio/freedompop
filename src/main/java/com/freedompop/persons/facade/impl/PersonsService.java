package com.freedompop.persons.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.facade.IPersonsService;

@RestController
public class PersonsService implements IPersonsService {

	@Autowired
	@Qualifier("personsServiceIntImpl")
	private IPersonsServiceInt personsServiceInt;
	
	@Override
	public void createPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		
	}

	
}
