package com.freedompop.persons.bussiness.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.dao.IPersonsDAO;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonsServiceIntImplTest {
	
	@InjectMocks
	private PersonsServiceIntImpl personServiceIntImpl;

	@Mock
	private IPersonsDAO personsDAO;
	
	
	@Test
	public void createPersonTest() {
		PersonDtoInt person=createPerson();
		when(personsDAO.createPerson(person)).thenReturn(createReponse());
		ResponseDtoInt response=personServiceIntImpl.createPerson(person);
		assertNotNull(response);

	}

	@Test
	public void findPersonTest() {
		PersonDtoInt person=createPerson();
		when(personsDAO.findPerson(person)).thenReturn(createPerson());
		PersonDtoInt response=personServiceIntImpl.findPerson(person);
		assertNotNull(response);

	}

	@Test
	public void updatePersonTest() {
		PersonDtoInt person=createPerson();
		when(personsDAO.updatePerson(person)).thenReturn(createReponse());
		ResponseDtoInt response=personServiceIntImpl.updatePerson(person);
		assertNotNull(response);

	}

	@Test
	public void deletePersonTest() {
		PersonDtoInt person=createPerson();
		when(personsDAO.deletePerson(person)).thenReturn(createReponse());
		ResponseDtoInt response=personServiceIntImpl.deletePerson(person);
		assertNotNull(response);

	}

	@Test
	public void listPersonsTest() {
		when(personsDAO.listPersons()).thenReturn(createPersons());
		List<PersonDtoInt> response=personServiceIntImpl.listPersons();
		assertNotNull(response);
	}
	
	private PersonDtoInt createPerson() {
		return new PersonDtoInt(1, "Richard", "Walls", "767767766", "demo@demo.com", "someware|mexico|9|8|445533");
	}
	
	private List< PersonDtoInt >createPersons() {
		List< PersonDtoInt > persons=new ArrayList<PersonDtoInt>();
		persons.add(createPerson());
		persons.add(createPerson());
		persons.add(createPerson());
		return persons;
	}
	private ResponseDtoInt createReponse() {
		return new ResponseDtoInt("response");
	}
}
