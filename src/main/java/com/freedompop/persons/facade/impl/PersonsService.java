package com.freedompop.persons.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.facade.IPersonsService;
import com.freedompop.persons.facade.dto.PersonDto;
import com.freedompop.persons.facade.dto.ResponseDto;


@RestController("person")
public class PersonsService implements IPersonsService {

	@Autowired
	@Qualifier("personsServiceIntImpl")
	private IPersonsServiceInt personsServiceInt;
	

	@Override
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseDto createPerson(PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public PersonDto findPerson(PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseDto updatePerson(PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseDto deletePerson(PersonDto person) {
		// TODO Auto-generated method stub
		return null;
	}

}
