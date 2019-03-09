package com.freedompop.persons.bussiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.dao.IPersonsDAO;

@Component("personsServiceIntImpl")
public class PersonsServiceIntImpl  implements IPersonsServiceInt{
	
	@Autowired
	@Qualifier("personsDAO")
	private IPersonsDAO personsDAO;

	@Override
	public ResponseDtoInt createPerson(PersonDtoInt person) {
		return personsDAO.createPerson(person);
	}

	@Override
	public PersonDtoInt findPerson(PersonDtoInt person) {
		return personsDAO.findPerson(person);
	}

	@Override
	public ResponseDtoInt updatePerson(PersonDtoInt person) {
		return personsDAO.updatePerson(person);
	}

	@Override
	public ResponseDtoInt deletePerson(PersonDtoInt person) {
		return personsDAO.deletePerson(person);
	}

	@Override
	public List<PersonDtoInt> listPersons() {
		return personsDAO.listPersons();
	}


	
	
}
