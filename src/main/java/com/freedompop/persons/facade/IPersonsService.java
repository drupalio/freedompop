package com.freedompop.persons.facade;

import java.util.List;

import com.freedompop.persons.facade.dto.PersonDto;
import com.freedompop.persons.facade.dto.ResponseDto;

public interface IPersonsService {
	
	public List<PersonDto> listPersons();
	public ResponseDto createPerson(PersonDto person);
	public PersonDto findPerson(PersonDto person);
	public ResponseDto updatePerson(PersonDto person);
	public ResponseDto deletePerson(PersonDto person);
}
