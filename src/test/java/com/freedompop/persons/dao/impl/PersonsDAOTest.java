package com.freedompop.persons.dao.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.dao.PersonRepository;
import com.freedompop.persons.entities.PersonEntity;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonsDAOTest {
	
	@InjectMocks
	private PersonsDAO personDao;
	
	@Mock
	DataSource dataSource;

	@Mock
	private PersonRepository personRepository;

	@Mock
	private Mapper<PersonEntity, PersonDtoInt> personEntityMapper;

	
	@Test
	public void createPerson() {
		personDao.createPerson(createPersonDummy());
	}
	

	
	private PersonDtoInt createPersonDummy() {
		return new PersonDtoInt(1, "Richard", "Walls", "767767766", "demo@demo.com", "someware|mexico|9|8|445533");
	}
	
	private List< PersonDtoInt >createPersons() {
		List< PersonDtoInt > persons=new ArrayList<PersonDtoInt>();
		persons.add(createPersonDummy());
		persons.add(createPersonDummy());
		persons.add(createPersonDummy());
		return persons;
	}
	private ResponseDtoInt createReponse() {
		return new ResponseDtoInt("response");
	}
	
}
