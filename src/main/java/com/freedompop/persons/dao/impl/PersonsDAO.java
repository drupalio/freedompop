package com.freedompop.persons.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.dao.IPersonsDAO;

@Repository("personsDAO")
@Transactional
public class PersonsDAO implements IPersonsDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public ResponseDtoInt createPerson(PersonDtoInt person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDtoInt findPerson(PersonDtoInt person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDtoInt updatePerson(PersonDtoInt person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDtoInt deletePerson(PersonDtoInt person) {
		// TODO Auto-generated method stub
		return null;
	}


}
