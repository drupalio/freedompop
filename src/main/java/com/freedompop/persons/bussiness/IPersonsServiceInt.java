package com.freedompop.persons.bussiness;

import java.util.List;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;

public interface IPersonsServiceInt {
	public List<PersonDtoInt> listPersons();
	public ResponseDtoInt createPerson(PersonDtoInt person);
	public PersonDtoInt findPerson(PersonDtoInt person);
	public ResponseDtoInt updatePerson(PersonDtoInt person);
	public ResponseDtoInt deletePerson(PersonDtoInt person);
}
