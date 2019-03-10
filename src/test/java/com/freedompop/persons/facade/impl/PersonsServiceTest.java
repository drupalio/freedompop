package com.freedompop.persons.facade.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.commons.BussinesServiceException;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.facade.dto.PersonDto;
import com.freedompop.persons.facade.dto.ResponseDto;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonsServiceTest {
	
	@InjectMocks
	private PersonsService personService;
	
	
	@Mock
	private IPersonsServiceInt personsServiceInt;

	@Mock
	private Mapper<PersonDtoInt, PersonDto> personMapper;

	@Mock
	private Mapper<ResponseDtoInt, ResponseDto> responseMapper;

	
	
	@Test(expected=BussinesServiceException.class)
	public void createPersonPayloadIsNull() {
		ResponseDto output=personService.createPerson(null);
		assertNotNull(output);
	}


	
	@Test(expected=BussinesServiceException.class)
	public void updatePersonPayloadIsNull() {
		ResponseDto output=personService.updatePerson(null);
		assertNotNull(output);
	}
	
	

	
	@Test(expected=BussinesServiceException.class)
	public void deletePersonPayloadIsNull() {
		ResponseDto output=personService.deletePerson(null);
		assertNotNull(output);
	}

	@Test
	public void listPersons() {
		when(personsServiceInt.listPersons()).thenReturn(createPersons());
		List<PersonDto> persons=personService.listPersons();
		assertNotNull(persons);
	}

	@Test
	public void findPerson() {
		PersonDto payload=createOuterPersonDummy();
		PersonDtoInt innerPayload=createPersonDummy();
		when(personMapper.mapToInner(payload)).thenReturn(innerPayload);
		when(personsServiceInt.findPerson(innerPayload)).thenReturn(innerPayload);
		when(personMapper.mapToOutter(innerPayload)).thenReturn(payload);
		PersonDto response=personService.findPerson(payload);
		assertNotNull(response);
	}
	
	@Test(expected=BussinesServiceException.class)
	public void findPersonPersonIsNull() {
		PersonDto response=personService.findPerson(null);
		assertNotNull(response);
	}
	private PersonDto createOuterPersonDummy() {
		return new PersonDto(1, "Richard", "Walls", "767767766", "demo@demo.com", "someware|mexico|9|8|445533");
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
	
	
	private ResponseDto createOuterReponse() {
		return new ResponseDto("response");
	}
}
